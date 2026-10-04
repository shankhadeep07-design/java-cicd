package com.example.demo.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;

@Entity
@Table(name = "t_budget_master")
public class BudgetMaster {

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

    // FIX: bind as JSON so PostgreSQL accepts it for the jsonb column
    @JdbcTypeCode(SqlTypes.JSON)
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

    @Column(name = "tbm_user_role_id", columnDefinition = "text")
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

    public String getTbmId() { return tbmId; }
    public void setTbmId(String v) { this.tbmId = v; }

    public String getTbmType() { return tbmType; }
    public void setTbmType(String v) { this.tbmType = v; }

    public String getTbmFyId() { return tbmFyId; }
    public void setTbmFyId(String v) { this.tbmFyId = v; }

    public String getTbmDomainId() { return tbmDomainId; }
    public void setTbmDomainId(String v) { this.tbmDomainId = v; }

    public String getTbmPlantId() { return tbmPlantId; }
    public void setTbmPlantId(String v) { this.tbmPlantId = v; }

    public String getTbmBuId() { return tbmBuId; }
    public void setTbmBuId(String v) { this.tbmBuId = v; }

    public String getTbmStateId() { return tbmStateId; }
    public void setTbmStateId(String v) { this.tbmStateId = v; }

    public String getTbmDistrictId() { return tbmDistrictId; }
    public void setTbmDistrictId(String v) { this.tbmDistrictId = v; }

    public String getTbmBlockId() { return tbmBlockId; }
    public void setTbmBlockId(String v) { this.tbmBlockId = v; }

    public String getTbmGlCode() { return tbmGlCode; }
    public void setTbmGlCode(String v) { this.tbmGlCode = v; }

    public String getTbmProfitCenter() { return tbmProfitCenter; }
    public void setTbmProfitCenter(String v) { this.tbmProfitCenter = v; }

    public String getTbmNatureOfProject() { return tbmNatureOfProject; }
    public void setTbmNatureOfProject(String v) { this.tbmNatureOfProject = v; }

    public String getTbmProjectConcise() { return tbmProjectConcise; }
    public void setTbmProjectConcise(String v) { this.tbmProjectConcise = v; }

    public String getTbmProjectDuration() { return tbmProjectDuration; }
    public void setTbmProjectDuration(String v) { this.tbmProjectDuration = v; }

    public String getTbmNationalIndicatorFramework() { return tbmNationalIndicatorFramework; }
    public void setTbmNationalIndicatorFramework(String v) { this.tbmNationalIndicatorFramework = v; }

    public Double getTbmTotalBudgetAmount() { return tbmTotalBudgetAmount; }
    public void setTbmTotalBudgetAmount(Double v) { this.tbmTotalBudgetAmount = v; }

    public String getTbmBudgetList() { return tbmBudgetList; }
    public void setTbmBudgetList(String v) { this.tbmBudgetList = v; }

    public String getTbmStatus() { return tbmStatus; }
    public void setTbmStatus(String v) { this.tbmStatus = v; }

    public Integer getTbmApprovalOrder() { return tbmApprovalOrder; }
    public void setTbmApprovalOrder(Integer v) { this.tbmApprovalOrder = v; }

    public String getTbmFlArchive() { return tbmFlArchive; }
    public void setTbmFlArchive(String v) { this.tbmFlArchive = v; }

    public Long getTbmCreatedBy() { return tbmCreatedBy; }
    public void setTbmCreatedBy(Long v) { this.tbmCreatedBy = v; }

    public Long getTbmUpdatedBy() { return tbmUpdatedBy; }
    public void setTbmUpdatedBy(Long v) { this.tbmUpdatedBy = v; }

    public LocalDateTime getTbmCreatedAt() { return tbmCreatedAt; }
    public void setTbmCreatedAt(LocalDateTime v) { this.tbmCreatedAt = v; }

    public LocalDateTime getTbmUpdatedAt() { return tbmUpdatedAt; }
    public void setTbmUpdatedAt(LocalDateTime v) { this.tbmUpdatedAt = v; }

    public LocalDateTime getTbmDeletedAt() { return tbmDeletedAt; }
    public void setTbmDeletedAt(LocalDateTime v) { this.tbmDeletedAt = v; }

    public String getTbmApprovalId() { return tbmApprovalId; }
    public void setTbmApprovalId(String v) { this.tbmApprovalId = v; }

    public Integer getTbmApproverIndex() { return tbmApproverIndex; }
    public void setTbmApproverIndex(Integer v) { this.tbmApproverIndex = v; }

    public String getTbmUserRoleId() { return tbmUserRoleId; }
    public void setTbmUserRoleId(String v) { this.tbmUserRoleId = v; }

    public String getTbmNotType() { return tbmNotType; }
    public void setTbmNotType(String v) { this.tbmNotType = v; }

    public String getTbmThemeId() { return tbmThemeId; }
    public void setTbmThemeId(String v) { this.tbmThemeId = v; }

    public String getTbmForward() { return tbmForward; }
    public void setTbmForward(String v) { this.tbmForward = v; }

    public String getTbmDepartmentId() { return tbmDepartmentId; }
    public void setTbmDepartmentId(String v) { this.tbmDepartmentId = v; }

    public String getTbmForwardedToDepartment() { return tbmForwardedToDepartment; }
    public void setTbmForwardedToDepartment(String v) { this.tbmForwardedToDepartment = v; }

    public Integer getTbmForwardSequence() { return tbmForwardSequence; }
    public void setTbmForwardSequence(Integer v) { this.tbmForwardSequence = v; }

    public String getTbmForwardRoleId() { return tbmForwardRoleId; }
    public void setTbmForwardRoleId(String v) { this.tbmForwardRoleId = v; }

    public Long getTbmForwardUserId() { return tbmForwardUserId; }
    public void setTbmForwardUserId(Long v) { this.tbmForwardUserId = v; }

    public String getTbmBackForwardRoleId() { return tbmBackForwardRoleId; }
    public void setTbmBackForwardRoleId(String v) { this.tbmBackForwardRoleId = v; }

    public Long getTbmBackForwardUserId() { return tbmBackForwardUserId; }
    public void setTbmBackForwardUserId(Long v) { this.tbmBackForwardUserId = v; }

    public Long getTbmUserId() { return tbmUserId; }
    public void setTbmUserId(Long v) { this.tbmUserId = v; }
}