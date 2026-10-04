// src/main/java/com/example/demo/entity/SubSchedule.java
package com.example.demo.entity;

import jakarta.persistence.*;
import org.locationtech.jts.geom.MultiPolygon;

import java.time.OffsetDateTime;

@Entity
@Table(name = "t_sub_schedule_master")
public class SubSchedule {

    @Column(name = "wkb_geometry", columnDefinition = "geometry(MultiPolygon,4326)")
    private MultiPolygon wkbGeometry;

    @Id
    @Column(name = "tsubshcm_sub_schedule_id", length = 100, nullable = false)
    private String tsubshcmSubScheduleId;

    @Column(name = "tsubshcm_sub_schedule_name", length = 100)
    private String tsubshcmSubScheduleName;

    @Column(name = "tsubshcm_schedule_id", length = 100)
    private String tsubshcmScheduleId;

    @Column(name = "tsubshcm_is_active")
    private Boolean tsubshcmIsActive = true;

    @Column(name = "tsubshcm_created_by", length = 100)
    private String tsubshcmCreatedBy;

    @Column(name = "tsubshcm_updated_by", length = 100)
    private String tsubshcmUpdatedBy;

    @Column(name = "tsubshcm_created_at", nullable = false)
    private OffsetDateTime tsubshcmCreatedAt;

    @Column(name = "tsubshcm_updated_at", nullable = false)
    private OffsetDateTime tsubshcmUpdatedAt;

    @Column(name = "tsubshcm_deleted_at")
    private OffsetDateTime tsubshcmDeletedAt;

    // Getters and Setters

    public MultiPolygon getWkbGeometry() { return wkbGeometry; }
    public void setWkbGeometry(MultiPolygon wkbGeometry) { this.wkbGeometry = wkbGeometry; }

    public String getTsubshcmSubScheduleId() { return tsubshcmSubScheduleId; }
    public void setTsubshcmSubScheduleId(String tsubshcmSubScheduleId) { this.tsubshcmSubScheduleId = tsubshcmSubScheduleId; }

    public String getTsubshcmSubScheduleName() { return tsubshcmSubScheduleName; }
    public void setTsubshcmSubScheduleName(String tsubshcmSubScheduleName) { this.tsubshcmSubScheduleName = tsubshcmSubScheduleName; }

    public String getTsubshcmScheduleId() { return tsubshcmScheduleId; }
    public void setTsubshcmScheduleId(String tsubshcmScheduleId) { this.tsubshcmScheduleId = tsubshcmScheduleId; }

    public Boolean getTsubshcmIsActive() { return tsubshcmIsActive; }
    public void setTsubshcmIsActive(Boolean tsubshcmIsActive) { this.tsubshcmIsActive = tsubshcmIsActive; }

    public String getTsubshcmCreatedBy() { return tsubshcmCreatedBy; }
    public void setTsubshcmCreatedBy(String tsubshcmCreatedBy) { this.tsubshcmCreatedBy = tsubshcmCreatedBy; }

    public String getTsubshcmUpdatedBy() { return tsubshcmUpdatedBy; }
    public void setTsubshcmUpdatedBy(String tsubshcmUpdatedBy) { this.tsubshcmUpdatedBy = tsubshcmUpdatedBy; }

    public OffsetDateTime getTsubshcmCreatedAt() { return tsubshcmCreatedAt; }
    public void setTsubshcmCreatedAt(OffsetDateTime tsubshcmCreatedAt) { this.tsubshcmCreatedAt = tsubshcmCreatedAt; }

    public OffsetDateTime getTsubshcmUpdatedAt() { return tsubshcmUpdatedAt; }
    public void setTsubshcmUpdatedAt(OffsetDateTime tsubshcmUpdatedAt) { this.tsubshcmUpdatedAt = tsubshcmUpdatedAt; }

    public OffsetDateTime getTsubshcmDeletedAt() { return tsubshcmDeletedAt; }
    public void setTsubshcmDeletedAt(OffsetDateTime tsubshcmDeletedAt) { this.tsubshcmDeletedAt = tsubshcmDeletedAt; }
}