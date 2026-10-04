// src/main/java/com/example/demo/dto/ProfitCenterResponse.java
package com.example.demo.dto;

import java.time.OffsetDateTime;

public class ProfitCenterResponse {

    private String id;
    private String corporate;
    private String bu;
    private String glAccount;
    private String profitCentre;
    private String costCentre;
    private String stateId;
    private String districtId;
    private String locationId;
    private Boolean isActive;
    private Long createdBy;
    private Long updatedBy;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private OffsetDateTime deletedAt;

    public ProfitCenterResponse(String id, String corporate, String bu, String glAccount,
                                String profitCentre, String costCentre, String stateId,
                                String districtId, String locationId, Boolean isActive,
                                Long createdBy, Long updatedBy, OffsetDateTime createdAt,
                                OffsetDateTime updatedAt, OffsetDateTime deletedAt) {
        this.id = id;
        this.corporate = corporate;
        this.bu = bu;
        this.glAccount = glAccount;
        this.profitCentre = profitCentre;
        this.costCentre = costCentre;
        this.stateId = stateId;
        this.districtId = districtId;
        this.locationId = locationId;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    // Getters

    public String getId() { return id; }
    public String getCorporate() { return corporate; }
    public String getBu() { return bu; }
    public String getGlAccount() { return glAccount; }
    public String getProfitCentre() { return profitCentre; }
    public String getCostCentre() { return costCentre; }
    public String getStateId() { return stateId; }
    public String getDistrictId() { return districtId; }
    public String getLocationId() { return locationId; }
    public Boolean getIsActive() { return isActive; }
    public Long getCreatedBy() { return createdBy; }
    public Long getUpdatedBy() { return updatedBy; }
    public OffsetDateTime getCreatedAt() { return createdAt; }
    public OffsetDateTime getUpdatedAt() { return updatedAt; }
    public OffsetDateTime getDeletedAt() { return deletedAt; }
}