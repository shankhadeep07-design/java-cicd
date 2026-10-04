// src/main/java/com/example/demo/entity/State.java
package com.example.demo.entity;

import jakarta.persistence.*;
import org.locationtech.jts.geom.MultiPolygon;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Entity
@Table(name = "t_state")
public class State {

    @Column(name = "wkb_geometry", columnDefinition = "geometry(MultiPolygon,4326)")
    private MultiPolygon wkbGeometry;

    @Id
    @Column(name = "tsl_state_id", length = 100, nullable = false)
    private String tslStateId;

    @Column(name = "tsl_state_name", length = 100)
    private String tslStateName;

    @Column(name = "tsl_is_active")
    private Boolean tslIsActive = true;

    @Column(name = "tsl_created_by", length = 100)
    private String tslCreatedBy;

    @Column(name = "tsl_updated_by", length = 100)
    private String tslUpdatedBy;

    @Column(name = "tsl_created_at", nullable = false)
    private LocalDateTime tslCreatedAt;

    @Column(name = "tsl_updated_at", nullable = false)
    private LocalDateTime tslUpdatedAt;

    @Column(name = "tsl_deleted_at")
    private OffsetDateTime tslDeletedAt;

    // Getters and Setters

    public MultiPolygon getWkbGeometry() { return wkbGeometry; }
    public void setWkbGeometry(MultiPolygon wkbGeometry) { this.wkbGeometry = wkbGeometry; }

    public String getTslStateId() { return tslStateId; }
    public void setTslStateId(String tslStateId) { this.tslStateId = tslStateId; }

    public String getTslStateName() { return tslStateName; }
    public void setTslStateName(String tslStateName) { this.tslStateName = tslStateName; }

    public Boolean getTslIsActive() { return tslIsActive; }
    public void setTslIsActive(Boolean tslIsActive) { this.tslIsActive = tslIsActive; }

    public String getTslCreatedBy() { return tslCreatedBy; }
    public void setTslCreatedBy(String tslCreatedBy) { this.tslCreatedBy = tslCreatedBy; }

    public String getTslUpdatedBy() { return tslUpdatedBy; }
    public void setTslUpdatedBy(String tslUpdatedBy) { this.tslUpdatedBy = tslUpdatedBy; }

    public LocalDateTime getTslCreatedAt() { return tslCreatedAt; }
    public void setTslCreatedAt(LocalDateTime tslCreatedAt) { this.tslCreatedAt = tslCreatedAt; }

    public LocalDateTime getTslUpdatedAt() { return tslUpdatedAt; }
    public void setTslUpdatedAt(LocalDateTime tslUpdatedAt) { this.tslUpdatedAt = tslUpdatedAt; }

    public OffsetDateTime getTslDeletedAt() { return tslDeletedAt; }
    public void setTslDeletedAt(OffsetDateTime tslDeletedAt) { this.tslDeletedAt = tslDeletedAt; }
}