// src/main/java/com/example/demo/entity/Role.java
package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "t_roles")
public class Role {

    @Id
    @Column(name = "trl_role_id", length = 100, nullable = false)
    private String roleId;

    @Column(name = "trl_role_name", length = 100)
    private String roleName;

    @Column(name = "trl_is_active")
    private Boolean isActive;

    @Column(name = "trl_created_by", length = 100)
    private String createdBy;

    @Column(name = "trl_updated_by", length = 100)
    private String updatedBy;

    @Column(name = "trl_created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "trl_updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "trl_role_slug")
    private String roleSlug;

    @Column(name = "trl_tmd_module_id")
    private String moduleId;

    @Column(name = "trl_deleted_at")
    private LocalTime deletedAt;

    @Column(name = "trl_is_admin")
    private String isAdmin;

    @Column(name = "trl_ttm_type_id")
    private String typeId;

    @Column(name = "trl_access_amount")
    private Double accessAmount;

    @Column(name = "trl_description")
    private String description;

    @Column(name = "trl_min_access_amount")
    private Double minAccessAmount;

    @Column(name = "trl_max_access_amount")
    private Double maxAccessAmount;

    @Column(name = "trl_department", length = 100)
    private String department;

    // Getters and setters

    public String getRoleId() { return roleId; }
    public void setRoleId(String roleId) { this.roleId = roleId; }

    public String getRoleName() { return roleName; }
    public void setRoleName(String roleName) { this.roleName = roleName; }

    public Boolean getIsActive() { return isActive; }
    public void setIsActive(Boolean isActive) { this.isActive = isActive; }

    public String getCreatedBy() { return createdBy; }
    public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }

    public String getUpdatedBy() { return updatedBy; }
    public void setUpdatedBy(String updatedBy) { this.updatedBy = updatedBy; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    public String getRoleSlug() { return roleSlug; }
    public void setRoleSlug(String roleSlug) { this.roleSlug = roleSlug; }

    public String getModuleId() { return moduleId; }
    public void setModuleId(String moduleId) { this.moduleId = moduleId; }

    public LocalTime getDeletedAt() { return deletedAt; }
    public void setDeletedAt(LocalTime deletedAt) { this.deletedAt = deletedAt; }

    public String getIsAdmin() { return isAdmin; }
    public void setIsAdmin(String isAdmin) { this.isAdmin = isAdmin; }

    public String getTypeId() { return typeId; }
    public void setTypeId(String typeId) { this.typeId = typeId; }

    public Double getAccessAmount() { return accessAmount; }
    public void setAccessAmount(Double accessAmount) { this.accessAmount = accessAmount; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Double getMinAccessAmount() { return minAccessAmount; }
    public void setMinAccessAmount(Double minAccessAmount) { this.minAccessAmount = minAccessAmount; }

    public Double getMaxAccessAmount() { return maxAccessAmount; }
    public void setMaxAccessAmount(Double maxAccessAmount) { this.maxAccessAmount = maxAccessAmount; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}