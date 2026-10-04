// src/main/java/com/example/demo/entity/ScheduleSeven.java
package com.example.demo.entity;

import jakarta.persistence.*;
import org.locationtech.jts.geom.MultiPolygon;

import java.time.OffsetDateTime;

@Entity
@Table(name = "t_schedule_seven_master")
public class ScheduleSeven {

    @Column(name = "wkb_geometry", columnDefinition = "geometry(MultiPolygon,4326)")
    private MultiPolygon wkbGeometry;

    @Id
    @Column(name = "tschm_schedule_id", length = 100, nullable = false)
    private String tschmScheduleId;

    @Column(name = "tschm_schedule_name", columnDefinition = "text")
    private String tschmScheduleName;

    @Column(name = "tschm_is_active")
    private Boolean tschmIsActive = true;

    @Column(name = "tschm_created_by", length = 100)
    private String tschmCreatedBy;

    @Column(name = "tschm_updated_by", length = 100)
    private String tschmUpdatedBy;

    @Column(name = "tschm_created_at", nullable = false)
    private OffsetDateTime tschmCreatedAt;

    @Column(name = "tschm_updated_at", nullable = false)
    private OffsetDateTime tschmUpdatedAt;

    @Column(name = "tschm_deleted_at")
    private OffsetDateTime tschmDeletedAt;

    @Column(name = "tschm_schedule_vii_line_item")
    private String tschmScheduleViiLineItem;

    @Column(name = "tschm_sub_activity_item_number")
    private String tschmSubActivityItemNumber;

    @Column(name = "tschm_sub_activity_description", columnDefinition = "text")
    private String tschmSubActivityDescription;

    // Getters and Setters

    public MultiPolygon getWkbGeometry() { return wkbGeometry; }
    public void setWkbGeometry(MultiPolygon wkbGeometry) { this.wkbGeometry = wkbGeometry; }

    public String getTschmScheduleId() { return tschmScheduleId; }
    public void setTschmScheduleId(String tschmScheduleId) { this.tschmScheduleId = tschmScheduleId; }

    public String getTschmScheduleName() { return tschmScheduleName; }
    public void setTschmScheduleName(String tschmScheduleName) { this.tschmScheduleName = tschmScheduleName; }

    public Boolean getTschmIsActive() { return tschmIsActive; }
    public void setTschmIsActive(Boolean tschmIsActive) { this.tschmIsActive = tschmIsActive; }

    public String getTschmCreatedBy() { return tschmCreatedBy; }
    public void setTschmCreatedBy(String tschmCreatedBy) { this.tschmCreatedBy = tschmCreatedBy; }

    public String getTschmUpdatedBy() { return tschmUpdatedBy; }
    public void setTschmUpdatedBy(String tschmUpdatedBy) { this.tschmUpdatedBy = tschmUpdatedBy; }

    public OffsetDateTime getTschmCreatedAt() { return tschmCreatedAt; }
    public void setTschmCreatedAt(OffsetDateTime tschmCreatedAt) { this.tschmCreatedAt = tschmCreatedAt; }

    public OffsetDateTime getTschmUpdatedAt() { return tschmUpdatedAt; }
    public void setTschmUpdatedAt(OffsetDateTime tschmUpdatedAt) { this.tschmUpdatedAt = tschmUpdatedAt; }

    public OffsetDateTime getTschmDeletedAt() { return tschmDeletedAt; }
    public void setTschmDeletedAt(OffsetDateTime tschmDeletedAt) { this.tschmDeletedAt = tschmDeletedAt; }

    public String getTschmScheduleViiLineItem() { return tschmScheduleViiLineItem; }
    public void setTschmScheduleViiLineItem(String tschmScheduleViiLineItem) { this.tschmScheduleViiLineItem = tschmScheduleViiLineItem; }

    public String getTschmSubActivityItemNumber() { return tschmSubActivityItemNumber; }
    public void setTschmSubActivityItemNumber(String tschmSubActivityItemNumber) { this.tschmSubActivityItemNumber = tschmSubActivityItemNumber; }

    public String getTschmSubActivityDescription() { return tschmSubActivityDescription; }
    public void setTschmSubActivityDescription(String tschmSubActivityDescription) { this.tschmSubActivityDescription = tschmSubActivityDescription; }
}