package com.example.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "t_budget_master")
public class Budgeting {

    @Id
    @Column(name = "tbm_id", length = 100, nullable = false)
    private String tbmId;

    @Column(name = "tbm_type", length = 100)
    private String tbmType;

    @Column(name = "tbm_fy_id", length = 100)
    private String tbmFyId;

    @Column(name = "tbm_domain_id", length = 100)
    private String tbmDomainId;

    @Column(name = "tbm_plant_id", length = 100)
    private String tbmPlantId;

    @Column(name = "tbm_bu_id", length = 100)
    private String tbmBuId;

    @Column(name = "tbm_state_id", length = 100)
    private String tbmStateId;

    @Column(name = "tbm_district_id", length = 100)
    private String tbmDistrictId;

    @Column(name = "tbm_block_id", length = 100)
    private String tbmBlockId;

    @Column(name = "tbm_gl_code", length = 100)
    private String tbmGlCode;

    @Column(name = "tbm_profit_center", length = 100)
    private String tbmProfitCenter;

    @Column(name = "tbm_nature_of_project", length = 100)
    private String tbmNatureOfProject;

    @Column(name = "tbm_project_concise", length = 100)
    private String tbmProjectConcise;

    @Column(name = "tbm_project_duration", length = 100)
    private String tbmProjectDuration;

    @Column(name = "tbm_national_indicator_framework", length = 100)
    private String tbmNationalIndicatorFramework;

    @Column(name = "tbm_total_budget_amount")
    private Double tbmTotalBudgetAmount;

    @Column(name = "tbm_budget_list", columnDefinition = "jsonb")
    private String tbmBudgetList;

    @Column(name = "tbm_status", length = 255, nullable = false)
    private String tbmStatus = "draft";

    @Column(name = "tbm_approval_order")
    private Integer tbmApprovalOrder;

    @Column(name = "tbm_fl_archive", length = 1, nullable = false)
    private String tbmFlArchive = "N";

    @Column(name = "tbm_created_by")
    private Long tbmCreatedBy;

    @Column(name = "tbm_updated_by")
    private Long tbmUpdatedBy;

    @Column(name = "tbm_created_at", nullable = false)
    private LocalDateTime tbmCreatedAt;

    @Column(name = "tbm_updated_at", nullable = false)
    private LocalDateTime tbmUpdatedAt;

    @Column(name = "tbm_deleted_at")
    private LocalDateTime tbmDeletedAt;

    @Column(name = "tbm_approval_id")
    private String tbmApprovalId;

    @Column(name = "tbm_approver_index")
    private Integer tbmApproverIndex;

    @Column(name = "tbm_user_role_id")
    private String tbmUserRoleId;

    @Column(name = "tbm_not_type")
    private String tbmNotType;

    @Column(name = "tbm_theme_id")
    private String tbmThemeId;

    @Column(name = "tbm_forward")
    private String tbmForward;

    @Column(name = "tbm_department_id")
    private String tbmDepartmentId;

    @Column(name = "tbm_forwarded_to_department")
    private String tbmForwardedToDepartment;

    @Column(name = "tbm_forward_sequence")
    private Integer tbmForwardSequence;

    @Column(name = "tbm_forward_role_id")
    private String tbmForwardRoleId;

    @Column(name = "tbm_forward_user_id")
    private Long tbmForwardUserId;

    @Column(name = "tbm_back_forward_role_id")
    private String tbmBackForwardRoleId;

    @Column(name = "tbm_back_forward_user_id")
    private Long tbmBackForwardUserId;

    @Column(name = "tbm_user_id")
    private Long tbmUserId;


    // Getters and Setters

    public String getTbmId() {
        return tbmId;
    }

    public void setTbmId(String tbmId) {
        this.tbmId = tbmId;
    }

    public String getTbmType() {
        return tbmType;
    }

    public void setTbmType(String tbmType) {
        this.tbmType = tbmType;
    }

    public String getTbmFyId() {
        return tbmFyId;
    }

    public void setTbmFyId(String tbmFyId) {
        this.tbmFyId = tbmFyId;
    }

    public String getTbmDomainId() {
        return tbmDomainId;
    }

    public void setTbmDomainId(String tbmDomainId) {
        this.tbmDomainId = tbmDomainId;
    }

    public String getTbmPlantId() {
        return tbmPlantId;
    }

    public void setTbmPlantId(String tbmPlantId) {
        this.tbmPlantId = tbmPlantId;
    }

    public String getTbmBuId() {
        return tbmBuId;
    }

    public void setTbmBuId(String tbmBuId) {
        this.tbmBuId = tbmBuId;
    }

    public String getTbmStateId() {
        return tbmStateId;
    }

    public void setTbmStateId(String tbmStateId) {
        this.tbmStateId = tbmStateId;
    }

    public String getTbmDistrictId() {
        return tbmDistrictId;
    }

    public void setTbmDistrictId(String tbmDistrictId) {
        this.tbmDistrictId = tbmDistrictId;
    }

    public String getTbmBlockId() {
        return tbmBlockId;
    }

    public void setTbmBlockId(String tbmBlockId) {
        this.tbmBlockId = tbmBlockId;
    }

    public String getTbmGlCode() {
        return tbmGlCode;
    }

    public void setTbmGlCode(String tbmGlCode) {
        this.tbmGlCode = tbmGlCode;
    }

    public String getTbmProfitCenter() {
        return tbmProfitCenter;
    }

    public void setTbmProfitCenter(String tbmProfitCenter) {
        this.tbmProfitCenter = tbmProfitCenter;
    }

    public String getTbmNatureOfProject() {
        return tbmNatureOfProject;
    }

    public void setTbmNatureOfProject(String tbmNatureOfProject) {
        this.tbmNatureOfProject = tbmNatureOfProject;
    }

    public String getTbmProjectConcise() {
        return tbmProjectConcise;
    }

    public void setTbmProjectConcise(String tbmProjectConcise) {
        this.tbmProjectConcise = tbmProjectConcise;
    }

    public String getTbmProjectDuration() {
        return tbmProjectDuration;
    }

    public void setTbmProjectDuration(String tbmProjectDuration) {
        this.tbmProjectDuration = tbmProjectDuration;
    }

    public String getTbmNationalIndicatorFramework() {
        return tbmNationalIndicatorFramework;
    }

    public void setTbmNationalIndicatorFramework(String tbmNationalIndicatorFramework) {
        this.tbmNationalIndicatorFramework = tbmNationalIndicatorFramework;
    }

    public Double getTbmTotalBudgetAmount() {
        return tbmTotalBudgetAmount;
    }

    public void setTbmTotalBudgetAmount(Double tbmTotalBudgetAmount) {
        this.tbmTotalBudgetAmount = tbmTotalBudgetAmount;
    }

    public String getTbmBudgetList() {
        return tbmBudgetList;
    }

    public void setTbmBudgetList(String tbmBudgetList) {
        this.tbmBudgetList = tbmBudgetList;
    }

    public String getTbmStatus() {
        return tbmStatus;
    }

    public void setTbmStatus(String tbmStatus) {
        this.tbmStatus = tbmStatus;
    }

    public Integer getTbmApprovalOrder() {
        return tbmApprovalOrder;
    }

    public void setTbmApprovalOrder(Integer tbmApprovalOrder) {
        this.tbmApprovalOrder = tbmApprovalOrder;
    }

    public String getTbmFlArchive() {
        return tbmFlArchive;
    }

    public void setTbmFlArchive(String tbmFlArchive) {
        this.tbmFlArchive = tbmFlArchive;
    }

    public Long getTbmCreatedBy() {
        return tbmCreatedBy;
    }

    public void setTbmCreatedBy(Long tbmCreatedBy) {
        this.tbmCreatedBy = tbmCreatedBy;
    }

    public Long getTbmUpdatedBy() {
        return tbmUpdatedBy;
    }

    public void setTbmUpdatedBy(Long tbmUpdatedBy) {
        this.tbmUpdatedBy = tbmUpdatedBy;
    }

    public LocalDateTime getTbmCreatedAt() {
        return tbmCreatedAt;
    }

    public void setTbmCreatedAt(LocalDateTime tbmCreatedAt) {
        this.tbmCreatedAt = tbmCreatedAt;
    }

    public LocalDateTime getTbmUpdatedAt() {
        return tbmUpdatedAt;
    }

    public void setTbmUpdatedAt(LocalDateTime tbmUpdatedAt) {
        this.tbmUpdatedAt = tbmUpdatedAt;
    }

    public LocalDateTime getTbmDeletedAt() {
        return tbmDeletedAt;
    }

    public void setTbmDeletedAt(LocalDateTime tbmDeletedAt) {
        this.tbmDeletedAt = tbmDeletedAt;
    }

    public String getTbmApprovalId() {
        return tbmApprovalId;
    }

    public void setTbmApprovalId(String tbmApprovalId) {
        this.tbmApprovalId = tbmApprovalId;
    }

    public Integer getTbmApproverIndex() {
        return tbmApproverIndex;
    }

    public void setTbmApproverIndex(Integer tbmApproverIndex) {
        this.tbmApproverIndex = tbmApproverIndex;
    }

    public String getTbmUserRoleId() {
        return tbmUserRoleId;
    }

    public void setTbmUserRoleId(String tbmUserRoleId) {
        this.tbmUserRoleId = tbmUserRoleId;
    }

    public String getTbmNotType() {
        return tbmNotType;
    }

    public void setTbmNotType(String tbmNotType) {
        this.tbmNotType = tbmNotType;
    }

    public String getTbmThemeId() {
        return tbmThemeId;
    }

    public void setTbmThemeId(String tbmThemeId) {
        this.tbmThemeId = tbmThemeId;
    }

    public String getTbmForward() {
        return tbmForward;
    }

    public void setTbmForward(String tbmForward) {
        this.tbmForward = tbmForward;
    }

    public String getTbmDepartmentId() {
        return tbmDepartmentId;
    }

    public void setTbmDepartmentId(String tbmDepartmentId) {
        this.tbmDepartmentId = tbmDepartmentId;
    }

    public String getTbmForwardedToDepartment() {
        return tbmForwardedToDepartment;
    }

    public void setTbmForwardedToDepartment(String tbmForwardedToDepartment) {
        this.tbmForwardedToDepartment = tbmForwardedToDepartment;
    }

    public Integer getTbmForwardSequence() {
        return tbmForwardSequence;
    }

    public void setTbmForwardSequence(Integer tbmForwardSequence) {
        this.tbmForwardSequence = tbmForwardSequence;
    }

    public String getTbmForwardRoleId() {
        return tbmForwardRoleId;
    }

    public void setTbmForwardRoleId(String tbmForwardRoleId) {
        this.tbmForwardRoleId = tbmForwardRoleId;
    }

    public Long getTbmForwardUserId() {
        return tbmForwardUserId;
    }

    public void setTbmForwardUserId(Long tbmForwardUserId) {
        this.tbmForwardUserId = tbmForwardUserId;
    }

    public String getTbmBackForwardRoleId() {
        return tbmBackForwardRoleId;
    }

    public void setTbmBackForwardRoleId(String tbmBackForwardRoleId) {
        this.tbmBackForwardRoleId = tbmBackForwardRoleId;
    }

    public Long getTbmBackForwardUserId() {
        return tbmBackForwardUserId;
    }

    public void setTbmBackForwardUserId(Long tbmBackForwardUserId) {
        this.tbmBackForwardUserId = tbmBackForwardUserId;
    }

    public Long getTbmUserId() {
        return tbmUserId;
    }

    public void setTbmUserId(Long tbmUserId) {
        this.tbmUserId = tbmUserId;
    }
}