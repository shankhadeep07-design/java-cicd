// src/main/java/com/example/demo/dto/SubActivityResponse.java
package com.example.demo.dto;

import java.time.OffsetDateTime;

public class SubActivityResponse {

    private String subActivityId;
    private String subActivityName;
    private String scheduleId;
    private String focusAreaId;
    private String activityId;
    private Boolean isActive;
    private String createdBy;
    private String updatedBy;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private OffsetDateTime deletedAt;

    public SubActivityResponse(String subActivityId, String subActivityName, String scheduleId,
                               String focusAreaId, String activityId, Boolean isActive,
                               String createdBy, String updatedBy, OffsetDateTime createdAt,
                               OffsetDateTime updatedAt, OffsetDateTime deletedAt) {
        this.subActivityId = subActivityId;
        this.subActivityName = subActivityName;
        this.scheduleId = scheduleId;
        this.focusAreaId = focusAreaId;
        this.activityId = activityId;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public String getSubActivityId() { return subActivityId; }
    public String getSubActivityName() { return subActivityName; }
    public String getScheduleId() { return scheduleId; }
    public String getFocusAreaId() { return focusAreaId; }
    public String getActivityId() { return activityId; }
    public Boolean getIsActive() { return isActive; }
    public String getCreatedBy() { return createdBy; }
    public String getUpdatedBy() { return updatedBy; }
    public OffsetDateTime getCreatedAt() { return createdAt; }
    public OffsetDateTime getUpdatedAt() { return updatedAt; }
    public OffsetDateTime getDeletedAt() { return deletedAt; }
}