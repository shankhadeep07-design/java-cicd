// src/main/java/com/example/demo/entity/SubActivity.java
package com.example.demo.entity;

import jakarta.persistence.*;
import org.locationtech.jts.geom.MultiPolygon;

import java.time.OffsetDateTime;

@Entity
@Table(name = "t_sub_activity_master")
public class SubActivity {

    @Column(name = "wkb_geometry", columnDefinition = "geometry(MultiPolygon,4326)")
    private MultiPolygon wkbGeometry;

    @Id
    @Column(name = "tsactm_sub_activity_id", length = 100, nullable = false)
    private String tsactmSubActivityId;

    @Column(name = "tsactm_sub_activity_name", length = 100)
    private String tsactmSubActivityName;

    @Column(name = "tsactm_schedule_id", length = 100)
    private String tsactmScheduleId;

    @Column(name = "tsactm_focus_area_id", length = 100)
    private String tsactmFocusAreaId;

    @Column(name = "tsactm_activity_id", length = 100)
    private String tsactmActivityId;

    @Column(name = "tsactm_is_active")
    private Boolean tsactmIsActive = true;

    @Column(name = "tsactm_created_by", length = 100)
    private String tsactmCreatedBy;

    @Column(name = "tsactm_updated_by", length = 100)
    private String tsactmUpdatedBy;

    @Column(name = "tsactm_created_at", nullable = false)
    private OffsetDateTime tsactmCreatedAt;

    @Column(name = "tsactm_updated_at", nullable = false)
    private OffsetDateTime tsactmUpdatedAt;

    @Column(name = "tsactm_deleted_at")
    private OffsetDateTime tsactmDeletedAt;

    // Getters and Setters

    public MultiPolygon getWkbGeometry() { return wkbGeometry; }
    public void setWkbGeometry(MultiPolygon wkbGeometry) { this.wkbGeometry = wkbGeometry; }

    public String getTsactmSubActivityId() { return tsactmSubActivityId; }
    public void setTsactmSubActivityId(String tsactmSubActivityId) { this.tsactmSubActivityId = tsactmSubActivityId; }

    public String getTsactmSubActivityName() { return tsactmSubActivityName; }
    public void setTsactmSubActivityName(String tsactmSubActivityName) { this.tsactmSubActivityName = tsactmSubActivityName; }

    public String getTsactmScheduleId() { return tsactmScheduleId; }
    public void setTsactmScheduleId(String tsactmScheduleId) { this.tsactmScheduleId = tsactmScheduleId; }

    public String getTsactmFocusAreaId() { return tsactmFocusAreaId; }
    public void setTsactmFocusAreaId(String tsactmFocusAreaId) { this.tsactmFocusAreaId = tsactmFocusAreaId; }

    public String getTsactmActivityId() { return tsactmActivityId; }
    public void setTsactmActivityId(String tsactmActivityId) { this.tsactmActivityId = tsactmActivityId; }

    public Boolean getTsactmIsActive() { return tsactmIsActive; }
    public void setTsactmIsActive(Boolean tsactmIsActive) { this.tsactmIsActive = tsactmIsActive; }

    public String getTsactmCreatedBy() { return tsactmCreatedBy; }
    public void setTsactmCreatedBy(String tsactmCreatedBy) { this.tsactmCreatedBy = tsactmCreatedBy; }

    public String getTsactmUpdatedBy() { return tsactmUpdatedBy; }
    public void setTsactmUpdatedBy(String tsactmUpdatedBy) { this.tsactmUpdatedBy = tsactmUpdatedBy; }

    public OffsetDateTime getTsactmCreatedAt() { return tsactmCreatedAt; }
    public void setTsactmCreatedAt(OffsetDateTime tsactmCreatedAt) { this.tsactmCreatedAt = tsactmCreatedAt; }

    public OffsetDateTime getTsactmUpdatedAt() { return tsactmUpdatedAt; }
    public void setTsactmUpdatedAt(OffsetDateTime tsactmUpdatedAt) { this.tsactmUpdatedAt = tsactmUpdatedAt; }

    public OffsetDateTime getTsactmDeletedAt() { return tsactmDeletedAt; }
    public void setTsactmDeletedAt(OffsetDateTime tsactmDeletedAt) { this.tsactmDeletedAt = tsactmDeletedAt; }
}