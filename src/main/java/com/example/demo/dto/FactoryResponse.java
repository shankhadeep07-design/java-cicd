// src/main/java/com/example/demo/dto/FactoryResponse.java
package com.example.demo.dto;

import java.time.OffsetDateTime;

public class FactoryResponse {

    private String factoryId;
    private String factoryName;
    private String stateId;
    private String districtId;
    private String blockId;
    private String locationId;
    private Boolean isActive;
    private String createdBy;
    private String updatedBy;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private OffsetDateTime deletedAt;
    private String businessAreaId;

    public FactoryResponse(String factoryId, String factoryName, String stateId, String districtId,
                           String blockId, String locationId, Boolean isActive, String createdBy,
                           String updatedBy, OffsetDateTime createdAt, OffsetDateTime updatedAt,
                           OffsetDateTime deletedAt, String businessAreaId) {
        this.factoryId = factoryId;
        this.factoryName = factoryName;
        this.stateId = stateId;
        this.districtId = districtId;
        this.blockId = blockId;
        this.locationId = locationId;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.businessAreaId = businessAreaId;
    }

    // Getters

    public String getFactoryId() { return factoryId; }
    public String getFactoryName() { return factoryName; }
    public String getStateId() { return stateId; }
    public String getDistrictId() { return districtId; }
    public String getBlockId() { return blockId; }
    public String getLocationId() { return locationId; }
    public Boolean getIsActive() { return isActive; }
    public String getCreatedBy() { return createdBy; }
    public String getUpdatedBy() { return updatedBy; }
    public OffsetDateTime getCreatedAt() { return createdAt; }
    public OffsetDateTime getUpdatedAt() { return updatedAt; }
    public OffsetDateTime getDeletedAt() { return deletedAt; }
    public String getBusinessAreaId() { return businessAreaId; }

    public static class MasterResponse {
    }
}