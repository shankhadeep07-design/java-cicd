// src/main/java/com/example/demo/entity/Factory.java
package com.example.demo.entity;

import jakarta.persistence.*;
import org.locationtech.jts.geom.MultiPolygon;

import java.time.OffsetDateTime;

@Entity
@Table(name = "t_factory_master")
public class Factory {

    @Column(name = "wkb_geometry", columnDefinition = "geometry(MultiPolygon,4326)")
    private MultiPolygon wkbGeometry;

    @Id
    @Column(name = "tfact_factory_id", length = 100, nullable = false)
    private String tfactFactoryId;

    @Column(name = "tfact_factory_name", length = 100)
    private String tfactFactoryName;

    @Column(name = "tfact_state_id", length = 100)
    private String tfactStateId;

    @Column(name = "tfact_district_id", length = 100)
    private String tfactDistrictId;

    @Column(name = "tfact_block_id", length = 100)
    private String tfactBlockId;

    @Column(name = "tfact_location_id", length = 100)
    private String tfactLocationId;

    @Column(name = "tfact_is_active")
    private Boolean tfactIsActive = true;

    @Column(name = "tfact_created_by", length = 100)
    private String tfactCreatedBy;

    @Column(name = "tfact_updated_by", length = 100)
    private String tfactUpdatedBy;

    @Column(name = "tfact_created_at", nullable = false)
    private OffsetDateTime tfactCreatedAt;

    @Column(name = "tfact_updated_at", nullable = false)
    private OffsetDateTime tfactUpdatedAt;

    @Column(name = "tfact_deleted_at")
    private OffsetDateTime tfactDeletedAt;

    @Column(name = "tfact_business_area_id", length = 100)
    private String tfactBusinessAreaId;

    // Getters and Setters

    public MultiPolygon getWkbGeometry() { return wkbGeometry; }
    public void setWkbGeometry(MultiPolygon wkbGeometry) { this.wkbGeometry = wkbGeometry; }

    public String getTfactFactoryId() { return tfactFactoryId; }
    public void setTfactFactoryId(String tfactFactoryId) { this.tfactFactoryId = tfactFactoryId; }

    public String getTfactFactoryName() { return tfactFactoryName; }
    public void setTfactFactoryName(String tfactFactoryName) { this.tfactFactoryName = tfactFactoryName; }

    public String getTfactStateId() { return tfactStateId; }
    public void setTfactStateId(String tfactStateId) { this.tfactStateId = tfactStateId; }

    public String getTfactDistrictId() { return tfactDistrictId; }
    public void setTfactDistrictId(String tfactDistrictId) { this.tfactDistrictId = tfactDistrictId; }

    public String getTfactBlockId() { return tfactBlockId; }
    public void setTfactBlockId(String tfactBlockId) { this.tfactBlockId = tfactBlockId; }

    public String getTfactLocationId() { return tfactLocationId; }
    public void setTfactLocationId(String tfactLocationId) { this.tfactLocationId = tfactLocationId; }

    public Boolean getTfactIsActive() { return tfactIsActive; }
    public void setTfactIsActive(Boolean tfactIsActive) { this.tfactIsActive = tfactIsActive; }

    public String getTfactCreatedBy() { return tfactCreatedBy; }
    public void setTfactCreatedBy(String tfactCreatedBy) { this.tfactCreatedBy = tfactCreatedBy; }

    public String getTfactUpdatedBy() { return tfactUpdatedBy; }
    public void setTfactUpdatedBy(String tfactUpdatedBy) { this.tfactUpdatedBy = tfactUpdatedBy; }

    public OffsetDateTime getTfactCreatedAt() { return tfactCreatedAt; }
    public void setTfactCreatedAt(OffsetDateTime tfactCreatedAt) { this.tfactCreatedAt = tfactCreatedAt; }

    public OffsetDateTime getTfactUpdatedAt() { return tfactUpdatedAt; }
    public void setTfactUpdatedAt(OffsetDateTime tfactUpdatedAt) { this.tfactUpdatedAt = tfactUpdatedAt; }

    public OffsetDateTime getTfactDeletedAt() { return tfactDeletedAt; }
    public void setTfactDeletedAt(OffsetDateTime tfactDeletedAt) { this.tfactDeletedAt = tfactDeletedAt; }

    public String getTfactBusinessAreaId() { return tfactBusinessAreaId; }
    public void setTfactBusinessAreaId(String tfactBusinessAreaId) { this.tfactBusinessAreaId = tfactBusinessAreaId; }
}