// src/main/java/com/example/demo/dto/ScheduleSevenResponse.java
package com.example.demo.dto;

import java.time.OffsetDateTime;

public class ScheduleSevenResponse {

    private String scheduleId;
    private String scheduleName;
    private Boolean isActive;
    private String createdBy;
    private String updatedBy;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private OffsetDateTime deletedAt;
    private String scheduleViiLineItem;
    private String subActivityItemNumber;
    private String subActivityDescription;

    public ScheduleSevenResponse(String scheduleId, String scheduleName, Boolean isActive,
                                 String createdBy, String updatedBy, OffsetDateTime createdAt,
                                 OffsetDateTime updatedAt, OffsetDateTime deletedAt,
                                 String scheduleViiLineItem, String subActivityItemNumber,
                                 String subActivityDescription) {
        this.scheduleId = scheduleId;
        this.scheduleName = scheduleName;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.scheduleViiLineItem = scheduleViiLineItem;
        this.subActivityItemNumber = subActivityItemNumber;
        this.subActivityDescription = subActivityDescription;
    }

    // Getters

    public String getScheduleId() { return scheduleId; }
    public String getScheduleName() { return scheduleName; }
    public Boolean getIsActive() { return isActive; }
    public String getCreatedBy() { return createdBy; }
    public String getUpdatedBy() { return updatedBy; }
    public OffsetDateTime getCreatedAt() { return createdAt; }
    public OffsetDateTime getUpdatedAt() { return updatedAt; }
    public OffsetDateTime getDeletedAt() { return deletedAt; }
    public String getScheduleViiLineItem() { return scheduleViiLineItem; }
    public String getSubActivityItemNumber() { return subActivityItemNumber; }
    public String getSubActivityDescription() { return subActivityDescription; }
}