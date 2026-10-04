// src/main/java/com/example/demo/dto/response/SubScheduleResponse.java
package com.example.demo.dto.response;

import java.time.OffsetDateTime;

public class SubScheduleResponse {

    private String subScheduleId;
    private String subScheduleName;
    private String scheduleId;
    private Boolean isActive;
    private String createdBy;
    private String updatedBy;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private OffsetDateTime deletedAt;

    public SubScheduleResponse(String subScheduleId, String subScheduleName, String scheduleId,
                               Boolean isActive, String createdBy, String updatedBy,
                               OffsetDateTime createdAt, OffsetDateTime updatedAt,
                               OffsetDateTime deletedAt) {
        this.subScheduleId = subScheduleId;
        this.subScheduleName = subScheduleName;
        this.scheduleId = scheduleId;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public String getSubScheduleId() { return subScheduleId; }
    public String getSubScheduleName() { return subScheduleName; }
    public String getScheduleId() { return scheduleId; }
    public Boolean getIsActive() { return isActive; }
    public String getCreatedBy() { return createdBy; }
    public String getUpdatedBy() { return updatedBy; }
    public OffsetDateTime getCreatedAt() { return createdAt; }
    public OffsetDateTime getUpdatedAt() { return updatedAt; }
    public OffsetDateTime getDeletedAt() { return deletedAt; }
}