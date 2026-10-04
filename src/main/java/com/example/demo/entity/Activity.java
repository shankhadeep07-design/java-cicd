// src/main/java/com/example/demo/entity/Activity.java
package com.example.demo.entity;

import jakarta.persistence.*;
import org.locationtech.jts.geom.MultiPolygon;

import java.time.OffsetDateTime;

@Entity
@Table(name = "t_activity_master")
public class Activity {

    @Column(name = "wkb_geometry", columnDefinition = "geometry(MultiPolygon,4326)")
    private MultiPolygon wkbGeometry;

    @Id
    @Column(name = "tactm_activity_id", length = 100, nullable = false)
    private String tactmActivityId;

    @Column(name = "tactm_activity_name", length = 100)
    private String tactmActivityName;

    @Column(name = "tactm_schedule_id", length = 100)
    private String tactmScheduleId;

    @Column(name = "tactm_focus_area_id", length = 100)
    private String tactmFocusAreaId;

    @Column(name = "tactm_is_active")
    private Boolean tactmIsActive = true;

    @Column(name = "tactm_created_by", length = 100)
    private String tactmCreatedBy;

    @Column(name = "tactm_updated_by", length = 100)
    private String tactmUpdatedBy;

    @Column(name = "tactm_created_at", nullable = false)
    private OffsetDateTime tactmCreatedAt;

    @Column(name = "tactm_updated_at", nullable = false)
    private OffsetDateTime tactmUpdatedAt;

    @Column(name = "tactm_deleted_at")
    private OffsetDateTime tactmDeletedAt;

    // Getters and Setters

    public MultiPolygon getWkbGeometry() { return wkbGeometry; }
    public void setWkbGeometry(MultiPolygon wkbGeometry) { this.wkbGeometry = wkbGeometry; }

    public String getTactmActivityId() { return tactmActivityId; }
    public void setTactmActivityId(String tactmActivityId) { this.tactmActivityId = tactmActivityId; }

    public String getTactmActivityName() { return tactmActivityName; }
    public void setTactmActivityName(String tactmActivityName) { this.tactmActivityName = tactmActivityName; }

    public String getTactmScheduleId() { return tactmScheduleId; }
    public void setTactmScheduleId(String tactmScheduleId) { this.tactmScheduleId = tactmScheduleId; }

    public String getTactmFocusAreaId() { return tactmFocusAreaId; }
    public void setTactmFocusAreaId(String tactmFocusAreaId) { this.tactmFocusAreaId = tactmFocusAreaId; }

    public Boolean getTactmIsActive() { return tactmIsActive; }
    public void setTactmIsActive(Boolean tactmIsActive) { this.tactmIsActive = tactmIsActive; }

    public String getTactmCreatedBy() { return tactmCreatedBy; }
    public void setTactmCreatedBy(String tactmCreatedBy) { this.tactmCreatedBy = tactmCreatedBy; }

    public String getTactmUpdatedBy() { return tactmUpdatedBy; }
    public void setTactmUpdatedBy(String tactmUpdatedBy) { this.tactmUpdatedBy = tactmUpdatedBy; }

    public OffsetDateTime getTactmCreatedAt() { return tactmCreatedAt; }
    public void setTactmCreatedAt(OffsetDateTime tactmCreatedAt) { this.tactmCreatedAt = tactmCreatedAt; }

    public OffsetDateTime getTactmUpdatedAt() { return tactmUpdatedAt; }
    public void setTactmUpdatedAt(OffsetDateTime tactmUpdatedAt) { this.tactmUpdatedAt = tactmUpdatedAt; }

    public OffsetDateTime getTactmDeletedAt() { return tactmDeletedAt; }
    public void setTactmDeletedAt(OffsetDateTime tactmDeletedAt) { this.tactmDeletedAt = tactmDeletedAt; }
}