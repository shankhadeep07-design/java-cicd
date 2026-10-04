// src/main/java/com/example/demo/entity/ThemeMaster.java
package com.example.demo.entity;

import jakarta.persistence.*;
import org.locationtech.jts.geom.MultiPolygon;

import java.time.OffsetDateTime;

@Entity
@Table(name = "t_theme_master")
public class ThemeMaster {

    @Column(name = "wkb_geometry", columnDefinition = "geometry(MultiPolygon,4326)")
    private MultiPolygon wkbGeometry;

    @Id
    @Column(name = "tthm_theme_id", length = 100, nullable = false)
    private String tthmThemeId;

    @Column(name = "tthm_theme_name", length = 100)
    private String tthmThemeName;

    @Column(name = "tthm_is_active")
    private Boolean tthmIsActive = true;

    @Column(name = "tthm_created_by", length = 100)
    private String tthmCreatedBy;

    @Column(name = "tthm_updated_by", length = 100)
    private String tthmUpdatedBy;

    @Column(name = "tthm_created_at", nullable = false)
    private OffsetDateTime tthmCreatedAt;

    @Column(name = "tthm_updated_at", nullable = false)
    private OffsetDateTime tthmUpdatedAt;

    @Column(name = "tthm_deleted_at")
    private OffsetDateTime tthmDeletedAt;

    @Column(name = "tthm_domain_id", length = 100)
    private String tthmDomainId;

    // Getters and Setters

    public MultiPolygon getWkbGeometry() { return wkbGeometry; }
    public void setWkbGeometry(MultiPolygon wkbGeometry) { this.wkbGeometry = wkbGeometry; }

    public String getTthmThemeId() { return tthmThemeId; }
    public void setTthmThemeId(String tthmThemeId) { this.tthmThemeId = tthmThemeId; }

    public String getTthmThemeName() { return tthmThemeName; }
    public void setTthmThemeName(String tthmThemeName) { this.tthmThemeName = tthmThemeName; }

    public Boolean getTthmIsActive() { return tthmIsActive; }
    public void setTthmIsActive(Boolean tthmIsActive) { this.tthmIsActive = tthmIsActive; }

    public String getTthmCreatedBy() { return tthmCreatedBy; }
    public void setTthmCreatedBy(String tthmCreatedBy) { this.tthmCreatedBy = tthmCreatedBy; }

    public String getTthmUpdatedBy() { return tthmUpdatedBy; }
    public void setTthmUpdatedBy(String tthmUpdatedBy) { this.tthmUpdatedBy = tthmUpdatedBy; }

    public OffsetDateTime getTthmCreatedAt() { return tthmCreatedAt; }
    public void setTthmCreatedAt(OffsetDateTime tthmCreatedAt) { this.tthmCreatedAt = tthmCreatedAt; }

    public OffsetDateTime getTthmUpdatedAt() { return tthmUpdatedAt; }
    public void setTthmUpdatedAt(OffsetDateTime tthmUpdatedAt) { this.tthmUpdatedAt = tthmUpdatedAt; }

    public OffsetDateTime getTthmDeletedAt() { return tthmDeletedAt; }
    public void setTthmDeletedAt(OffsetDateTime tthmDeletedAt) { this.tthmDeletedAt = tthmDeletedAt; }

    public String getTthmDomainId() { return tthmDomainId; }
    public void setTthmDomainId(String tthmDomainId) { this.tthmDomainId = tthmDomainId; }
}