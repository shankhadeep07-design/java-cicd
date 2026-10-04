package com.example.demo.seeder;

import com.example.demo.entity.Role;
import com.example.demo.repository.MasterRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.text.Normalizer;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
@Order(1)
@ConditionalOnProperty(name = "app.seed", havingValue = "true")
public class RoleSeeder implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(RoleSeeder.class);

    private final MasterRepository masterRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public RoleSeeder(MasterRepository masterRepository) {
        this.masterRepository = masterRepository;
    }

    @Override
    @Transactional
    public void run(String... args) {
        System.out.println(">>> RoleSeeder started");

        List<Role> existingRoles = masterRepository.findAllRoles();

        // slugs and names already in the table (lowercase for safe comparison)
        Set<String> existingSlugs = existingRoles.stream()
                .map(Role::getRoleSlug)
                .filter(s -> s != null)
                .map(s -> s.toLowerCase(Locale.ROOT))
                .collect(Collectors.toSet());

        Set<String> existingNames = existingRoles.stream()
                .map(Role::getRoleName)
                .filter(n -> n != null)
                .map(n -> n.trim().toLowerCase(Locale.ROOT))
                .collect(Collectors.toSet());

        System.out.println(">>> Existing slugs: " + existingSlugs);
        System.out.println(">>> Existing names: " + existingNames);

        List<String> roleNames = List.of("Manager", "Normal User");

        int inserted = 0;

        for (String name : roleNames) {
            String slug = slugify(name);

            if (existingSlugs.contains(slug)
                    || existingNames.contains(name.trim().toLowerCase(Locale.ROOT))) {
                System.out.println(">>> Skipped (already exists): " + name + " / " + slug);
                continue;
            }

            LocalDateTime now = LocalDateTime.now();

            Role role = new Role();
            role.setRoleId(UUID.randomUUID().toString());
            role.setRoleName(name);
            role.setRoleSlug(slug);
            role.setIsAdmin(slug.equals("admin") ? "Y" : "N");
            role.setIsActive(true);
            role.setCreatedBy("system");
            role.setUpdatedBy("system");
            role.setCreatedAt(now);
            role.setUpdatedAt(now);

            entityManager.persist(role);
            inserted++;
            System.out.println(">>> Seeded role: " + name + " / " + slug);
        }

        entityManager.flush(); // force the INSERTs to run now, so errors show up here

        System.out.println(">>> RoleSeeder finished. Inserted: " + inserted);
    }

    private String slugify(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");
        return normalized.toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z0-9]+", "-")
                .replaceAll("(^-|-$)", "");
    }
}