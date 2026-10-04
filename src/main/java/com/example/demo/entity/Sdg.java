// src/main/java/com/example/demo/entity/Sdg.java
package com.example.demo.entity;

import jakarta.persistence.*;
import org.locationtech.jts.geom.MultiPolygon;

import java.time.OffsetDateTime;

@Entity
@Table(name = "t_sdg_master")
public class Sdg {

    @Column(name = "wkb_geometry", columnDefinition = "geometry(MultiPolygon,4326)")
    private MultiPolygon wkbGeometry;

    @Id
    @Column(name = "tsdg_id", length = 100, nullable = false)
    private String tsdgId;

    @Column(name = "tsdg_name", length = 100)
    private String tsdgName;

    @Column(name = "tsdg_is_active")
    private Boolean tsdgIsActive = true;

    @Column(name = "tsdg_created_by", length = 100)
    private String tsdgCreatedBy;

    @Column(name = "tsdg_updated_by", length = 100)
    private String tsdgUpdatedBy;

    @Column(name = "tsdg_created_at", nullable = false)
    private OffsetDateTime tsdgCreatedAt;

    @Column(name = "tsdg_updated_at", nullable = false)
    private OffsetDateTime tsdgUpdatedAt;

    @Column(name = "tsdg_deleted_at")
    private OffsetDateTime tsdgDeletedAt;

    @Column(name = "tsdg_desc", columnDefinition = "text")
    private String tsdgDesc;

    // Getters and Setters

    public MultiPolygon getWkbGeometry() { return wkbGeometry; }
    public void setWkbGeometry(MultiPolygon wkbGeometry) { this.wkbGeometry = wkbGeometry; }

    public String getTsdgId() { return tsdgId; }
    public void setTsdgId(String tsdgId) { this.tsdgId = tsdgId; }

    public String getTsdgName() { return tsdgName; }
    public void setTsdgName(String tsdgName) { this.tsdgName = tsdgName; }

    public Boolean getTsdgIsActive() { return tsdgIsActive; }
    public void setTsdgIsActive(Boolean tsdgIsActive) { this.tsdgIsActive = tsdgIsActive; }

    public String getTsdgCreatedBy() { return tsdgCreatedBy; }
    public void setTsdgCreatedBy(String tsdgCreatedBy) { this.tsdgCreatedBy = tsdgCreatedBy; }

    public String getTsdgUpdatedBy() { return tsdgUpdatedBy; }
    public void setTsdgUpdatedBy(String tsdgUpdatedBy) { this.tsdgUpdatedBy = tsdgUpdatedBy; }

    public OffsetDateTime getTsdgCreatedAt() { return tsdgCreatedAt; }
    public void setTsdgCreatedAt(OffsetDateTime tsdgCreatedAt) { this.tsdgCreatedAt = tsdgCreatedAt; }

    public OffsetDateTime getTsdgUpdatedAt() { return tsdgUpdatedAt; }
    public void setTsdgUpdatedAt(OffsetDateTime tsdgUpdatedAt) { this.tsdgUpdatedAt = tsdgUpdatedAt; }

    public OffsetDateTime getTsdgDeletedAt() { return tsdgDeletedAt; }
    public void setTsdgDeletedAt(OffsetDateTime tsdgDeletedAt) { this.tsdgDeletedAt = tsdgDeletedAt; }

    public String getTsdgDesc() { return tsdgDesc; }
    public void setTsdgDesc(String tsdgDesc) { this.tsdgDesc = tsdgDesc; }
}