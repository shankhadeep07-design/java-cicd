// src/main/java/com/example/demo/dto/ActivityResponse.java
package com.example.demo.dto;

import java.time.OffsetDateTime;

public class ActivityResponse {

    private String activityId;
    private String activityName;
    private String scheduleId;
    private String focusAreaId;
    private Boolean isActive;
    private String createdBy;
    private String updatedBy;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private OffsetDateTime deletedAt;

    public ActivityResponse(String activityId, String activityName, String scheduleId,
                            String focusAreaId, Boolean isActive, String createdBy,
                            String updatedBy, OffsetDateTime createdAt, OffsetDateTime updatedAt,
                            OffsetDateTime deletedAt) {
        this.activityId = activityId;
        this.activityName = activityName;
        this.scheduleId = scheduleId;
        this.focusAreaId = focusAreaId;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public String getActivityId() { return activityId; }
    public String getActivityName() { return activityName; }
    public String getScheduleId() { return scheduleId; }
    public String getFocusAreaId() { return focusAreaId; }
    public Boolean getIsActive() { return isActive; }
    public String getCreatedBy() { return createdBy; }
    public String getUpdatedBy() { return updatedBy; }
    public OffsetDateTime getCreatedAt() { return createdAt; }
    public OffsetDateTime getUpdatedAt() { return updatedAt; }
    public OffsetDateTime getDeletedAt() { return deletedAt; }
}