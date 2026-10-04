package com.example.demo.dto;

import java.time.LocalDateTime;

public class ProjectResponse {

    private String id;
    private String proposalId;
    private String financialYearId;
    private String stateId;
    private String districtId;
    private String blockId;
    private String locationId;
    private Double latitude;
    private Double longitude;
    private String themeId;
    private String proposalName;
    private String projectTypeId;
    private String subProjectId;
    private String sdgId;
    private String scheduleSevenId;
    private Double allocateBudgetAmount;
    private Double utilizedTillToday;
    private String flArchive;
    private Long createdBy;
    private Long updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
    private String status;
    private String uniqueId;

    public ProjectResponse(
            String id,
            String proposalId,
            String financialYearId,
            String stateId,
            String districtId,
            String blockId,
            String locationId,
            Double latitude,
            Double longitude,
            String themeId,
            String proposalName,
            String projectTypeId,
            String subProjectId,
            String sdgId,
            String scheduleSevenId,
            Double allocateBudgetAmount,
            Double utilizedTillToday,
            String flArchive,
            Long createdBy,
            Long updatedBy,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            LocalDateTime deletedAt,
            String status,
            String uniqueId
    ) {
        this.id = id;
        this.proposalId = proposalId;
        this.financialYearId = financialYearId;
        this.stateId = stateId;
        this.districtId = districtId;
        this.blockId = blockId;
        this.locationId = locationId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.themeId = themeId;
        this.proposalName = proposalName;
        this.projectTypeId = projectTypeId;
        this.subProjectId = subProjectId;
        this.sdgId = sdgId;
        this.scheduleSevenId = scheduleSevenId;
        this.allocateBudgetAmount = allocateBudgetAmount;
        this.utilizedTillToday = utilizedTillToday;
        this.flArchive = flArchive;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.status = status;
        this.uniqueId = uniqueId;
    }

    public String getId() {
        return id;
    }

    public String getProposalId() {
        return proposalId;
    }

    public String getFinancialYearId() {
        return financialYearId;
    }

    public String getStateId() {
        return stateId;
    }

    public String getDistrictId() {
        return districtId;
    }

    public String getBlockId() {
        return blockId;
    }

    public String getLocationId() {
        return locationId;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public String getThemeId() {
        return themeId;
    }

    public String getProposalName() {
        return proposalName;
    }

    public String getProjectTypeId() {
        return projectTypeId;
    }

    public String getSubProjectId() {
        return subProjectId;
    }

    public String getSdgId() {
        return sdgId;
    }

    public String getScheduleSevenId() {
        return scheduleSevenId;
    }

    public Double getAllocateBudgetAmount() {
        return allocateBudgetAmount;
    }

    public Double getUtilizedTillToday() {
        return utilizedTillToday;
    }

    public String getFlArchive() {
        return flArchive;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public String getStatus() {
        return status;
    }

    public String getUniqueId() {
        return uniqueId;
    }
}