// src/main/java/com/example/demo/entity/District.java
package com.example.demo.entity;

import jakarta.persistence.*;
import org.locationtech.jts.geom.MultiPolygon;

import java.time.OffsetDateTime;

@Entity
@Table(name = "t_district")
public class District {

    @Column(name = "wkb_geometry", columnDefinition = "geometry(MultiPolygon,4326)")
    private MultiPolygon wkbGeometry;

    @Id
    @Column(name = "tdl_district_id", length = 100, nullable = false)
    private String tdlDistrictId;

    @Column(name = "tdl_district_name", length = 100)
    private String tdlDistrictName;

    @Column(name = "tdl_state_id", length = 100)
    private String tdlStateId;

    @Column(name = "tdl_is_active")
    private Boolean tdlIsActive = true;

    @Column(name = "tdl_created_by", length = 100)
    private String tdlCreatedBy;

    @Column(name = "tdl_updated_by", length = 100)
    private String tdlUpdatedBy;

    @Column(name = "tdl_created_at", nullable = false)
    private OffsetDateTime tdlCreatedAt;

    @Column(name = "tdl_updated_at", nullable = false)
    private OffsetDateTime tdlUpdatedAt;

    @Column(name = "tdl_deleted_at")
    private OffsetDateTime tdlDeletedAt;

    // Getters and Setters

    public MultiPolygon getWkbGeometry() { return wkbGeometry; }
    public void setWkbGeometry(MultiPolygon wkbGeometry) { this.wkbGeometry = wkbGeometry; }

    public String getTdlDistrictId() { return tdlDistrictId; }
    public void setTdlDistrictId(String tdlDistrictId) { this.tdlDistrictId = tdlDistrictId; }

    public String getTdlDistrictName() { return tdlDistrictName; }
    public void setTdlDistrictName(String tdlDistrictName) { this.tdlDistrictName = tdlDistrictName; }

    public String getTdlStateId() { return tdlStateId; }
    public void setTdlStateId(String tdlStateId) { this.tdlStateId = tdlStateId; }

    public Boolean getTdlIsActive() { return tdlIsActive; }
    public void setTdlIsActive(Boolean tdlIsActive) { this.tdlIsActive = tdlIsActive; }

    public String getTdlCreatedBy() { return tdlCreatedBy; }
    public void setTdlCreatedBy(String tdlCreatedBy) { this.tdlCreatedBy = tdlCreatedBy; }

    public String getTdlUpdatedBy() { return tdlUpdatedBy; }
    public void setTdlUpdatedBy(String tdlUpdatedBy) { this.tdlUpdatedBy = tdlUpdatedBy; }

    public OffsetDateTime getTdlCreatedAt() { return tdlCreatedAt; }
    public void setTdlCreatedAt(OffsetDateTime tdlCreatedAt) { this.tdlCreatedAt = tdlCreatedAt; }

    public OffsetDateTime getTdlUpdatedAt() { return tdlUpdatedAt; }
    public void setTdlUpdatedAt(OffsetDateTime tdlUpdatedAt) { this.tdlUpdatedAt = tdlUpdatedAt; }

    public OffsetDateTime getTdlDeletedAt() { return tdlDeletedAt; }
    public void setTdlDeletedAt(OffsetDateTime tdlDeletedAt) { this.tdlDeletedAt = tdlDeletedAt; }
}