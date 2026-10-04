// src/main/java/com/example/demo/dto/response/MasterListResponse.java
package com.example.demo.dto.response;

import java.time.OffsetDateTime;

public class MasterListResponse {

    private String id;
    private String masterListName;
    private String masterListDesc;
    private String masterListSlug;
    private Boolean isActive;
    private String createdBy;
    private String updatedBy;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private OffsetDateTime deletedAt;

    public MasterListResponse(String id, String masterListName, String masterListDesc,
                              String masterListSlug, Boolean isActive, String createdBy,
                              String updatedBy, OffsetDateTime createdAt, OffsetDateTime updatedAt,
                              OffsetDateTime deletedAt) {
        this.id = id;
        this.masterListName = masterListName;
        this.masterListDesc = masterListDesc;
        this.masterListSlug = masterListSlug;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    // Getters

    public String getId() { return id; }
    public String getMasterListName() { return masterListName; }
    public String getMasterListDesc() { return masterListDesc; }
    public String getMasterListSlug() { return masterListSlug; }
    public Boolean getIsActive() { return isActive; }
    public String getCreatedBy() { return createdBy; }
    public String getUpdatedBy() { return updatedBy; }
    public OffsetDateTime getCreatedAt() { return createdAt; }
    public OffsetDateTime getUpdatedAt() { return updatedAt; }
    public OffsetDateTime getDeletedAt() { return deletedAt; }
}