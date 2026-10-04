// src/main/java/com/example/demo/dto/SdgResponse.java
package com.example.demo.dto;

import java.time.OffsetDateTime;

public class SdgResponse {

    private String id;
    private String name;
    private Boolean isActive;
    private String createdBy;
    private String updatedBy;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private OffsetDateTime deletedAt;
    private String desc;

    public SdgResponse(String id, String name, Boolean isActive, String createdBy,
                       String updatedBy, OffsetDateTime createdAt, OffsetDateTime updatedAt,
                       OffsetDateTime deletedAt, String desc) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.desc = desc;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public Boolean getIsActive() { return isActive; }
    public String getCreatedBy() { return createdBy; }
    public String getUpdatedBy() { return updatedBy; }
    public OffsetDateTime getCreatedAt() { return createdAt; }
    public OffsetDateTime getUpdatedAt() { return updatedAt; }
    public OffsetDateTime getDeletedAt() { return deletedAt; }
    public String getDesc() { return desc; }
}