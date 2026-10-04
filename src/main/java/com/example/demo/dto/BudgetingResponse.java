package com.example.demo.dto;

import java.time.LocalDateTime;

public class BudgetingResponse {

    private String id;
    private String type;
    private String fyId;
    private String domainId;
    private String plantId;
    private String buId;
    private String stateId;
    private String districtId;
    private String blockId;
    private String glCode;
    private String profitCenter;
    private String natureOfProject;
    private String projectConcise;
    private String projectDuration;
    private String nationalIndicatorFramework;
    private Double totalBudgetAmount;
    private String budgetList;
    private String status;
    private Integer approvalOrder;
    private String flArchive;
    private Long createdBy;
    private Long updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
    private String approvalId;
    private Integer approverIndex;
    private String userRoleId;
    private String notType;
    private String themeId;
    private String forward;
    private String departmentId;
    private String forwardedToDepartment;
    private Integer forwardSequence;
    private String forwardRoleId;
    private Long forwardUserId;
    private String backForwardRoleId;
    private Long backForwardUserId;
    private Long userId;

    public BudgetingResponse(
            String id,
            String type,
            String fyId,
            String domainId,
            String plantId,
            String buId,
            String stateId,
            String districtId,
            String blockId,
            String glCode,
            String profitCenter,
            String natureOfProject,
            String projectConcise,
            String projectDuration,
            String nationalIndicatorFramework,
            Double totalBudgetAmount,
            String budgetList,
            String status,
            Integer approvalOrder,
            String flArchive,
            Long createdBy,
            Long updatedBy,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            LocalDateTime deletedAt,
            String approvalId,
            Integer approverIndex,
            String userRoleId,
            String notType,
            String themeId,
            String forward,
            String departmentId,
            String forwardedToDepartment,
            Integer forwardSequence,
            String forwardRoleId,
            Long forwardUserId,
            String backForwardRoleId,
            Long backForwardUserId,
            Long userId) {

        this.id = id;
        this.type = type;
        this.fyId = fyId;
        this.domainId = domainId;
        this.plantId = plantId;
        this.buId = buId;
        this.stateId = stateId;
        this.districtId = districtId;
        this.blockId = blockId;
        this.glCode = glCode;
        this.profitCenter = profitCenter;
        this.natureOfProject = natureOfProject;
        this.projectConcise = projectConcise;
        this.projectDuration = projectDuration;
        this.nationalIndicatorFramework = nationalIndicatorFramework;
        this.totalBudgetAmount = totalBudgetAmount;
        this.budgetList = budgetList;
        this.status = status;
        this.approvalOrder = approvalOrder;
        this.flArchive = flArchive;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.approvalId = approvalId;
        this.approverIndex = approverIndex;
        this.userRoleId = userRoleId;
        this.notType = notType;
        this.themeId = themeId;
        this.forward = forward;
        this.departmentId = departmentId;
        this.forwardedToDepartment = forwardedToDepartment;
        this.forwardSequence = forwardSequence;
        this.forwardRoleId = forwardRoleId;
        this.forwardUserId = forwardUserId;
        this.backForwardRoleId = backForwardRoleId;
        this.backForwardUserId = backForwardUserId;
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getFyId() {
        return fyId;
    }

    public String getDomainId() {
        return domainId;
    }

    public String getPlantId() {
        return plantId;
    }

    public String getBuId() {
        return buId;
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

    public String getGlCode() {
        return glCode;
    }

    public String getProfitCenter() {
        return profitCenter;
    }

    public String getNatureOfProject() {
        return natureOfProject;
    }

    public String getProjectConcise() {
        return projectConcise;
    }

    public String getProjectDuration() {
        return projectDuration;
    }

    public String getNationalIndicatorFramework() {
        return nationalIndicatorFramework;
    }

    public Double getTotalBudgetAmount() {
        return totalBudgetAmount;
    }

    public String getBudgetList() {
        return budgetList;
    }

    public String getStatus() {
        return status;
    }

    public Integer getApprovalOrder() {
        return approvalOrder;
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

    public String getApprovalId() {
        return approvalId;
    }

    public Integer getApproverIndex() {
        return approverIndex;
    }

    public String getUserRoleId() {
        return userRoleId;
    }

    public String getNotType() {
        return notType;
    }

    public String getThemeId() {
        return themeId;
    }

    public String getForward() {
        return forward;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public String getForwardedToDepartment() {
        return forwardedToDepartment;
    }

    public Integer getForwardSequence() {
        return forwardSequence;
    }

    public String getForwardRoleId() {
        return forwardRoleId;
    }

    public Long getForwardUserId() {
        return forwardUserId;
    }

    public String getBackForwardRoleId() {
        return backForwardRoleId;
    }

    public Long getBackForwardUserId() {
        return backForwardUserId;
    }

    public Long getUserId() {
        return userId;
    }
}