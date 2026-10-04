package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_project")   // ASSUMED table and column names
public class Project {

    @Id @Column(name = "tproj_id", length = 100, nullable = false) private String tprojId;
    @Column(name = "tproj_proposal_id") private String tprojProposalId;
    @Column(name = "tproj_financial_year_id") private String tprojFinancialYearId;
    @Column(name = "tproj_state_id") private String tprojStateId;
    @Column(name = "tproj_district_id") private String tprojDistrictId;
    @Column(name = "tproj_block_id") private String tprojBlockId;
    @Column(name = "tproj_location_id") private String tprojLocationId;
    @Column(name = "tproj_latitude") private Double tprojLatitude;
    @Column(name = "tproj_longitude") private Double tprojLongitude;
    @Column(name = "tproj_theme_id") private String tprojThemeId;
    @Column(name = "tproj_proposal_name") private String tprojProposalName;
    @Column(name = "tproj_project_type_id") private String tprojProjectTypeId;
    @Column(name = "tproj_sub_project_id") private String tprojSubProjectId;
    @Column(name = "tproj_sdg_id") private String tprojSdgId;
    @Column(name = "tproj_schedule_seven_id") private String tprojScheduleSevenId;
    @Column(name = "tproj_allocate_budget_amount") private Double tprojAllocateBudgetAmount;
    @Column(name = "tproj_utilized_till_today") private Double tprojUtilizedTillToday;
    @Column(name = "tproj_fl_archive", length = 1) private String tprojFlArchive = "N";
    @Column(name = "tproj_created_by") private Long tprojCreatedBy;
    @Column(name = "tproj_updated_by") private Long tprojUpdatedBy;
    @Column(name = "tproj_created_at", nullable = false) private LocalDateTime tprojCreatedAt;
    @Column(name = "tproj_updated_at", nullable = false) private LocalDateTime tprojUpdatedAt;
    @Column(name = "tproj_deleted_at") private LocalDateTime tprojDeletedAt;
    @Column(name = "tproj_status") private String tprojStatus;
    @Column(name = "tproj_unique_id") private String tprojUniqueId;

    public String getTprojId() { return tprojId; }
    public void setTprojId(String v) { this.tprojId = v; }
    public String getTprojProposalId() { return tprojProposalId; }
    public void setTprojProposalId(String v) { this.tprojProposalId = v; }
    public String getTprojFinancialYearId() { return tprojFinancialYearId; }
    public void setTprojFinancialYearId(String v) { this.tprojFinancialYearId = v; }
    public String getTprojStateId() { return tprojStateId; }
    public void setTprojStateId(String v) { this.tprojStateId = v; }
    public String getTprojDistrictId() { return tprojDistrictId; }
    public void setTprojDistrictId(String v) { this.tprojDistrictId = v; }
    public String getTprojBlockId() { return tprojBlockId; }
    public void setTprojBlockId(String v) { this.tprojBlockId = v; }
    public String getTprojLocationId() { return tprojLocationId; }
    public void setTprojLocationId(String v) { this.tprojLocationId = v; }
    public Double getTprojLatitude() { return tprojLatitude; }
    public void setTprojLatitude(Double v) { this.tprojLatitude = v; }
    public Double getTprojLongitude() { return tprojLongitude; }
    public void setTprojLongitude(Double v) { this.tprojLongitude = v; }
    public String getTprojThemeId() { return tprojThemeId; }
    public void setTprojThemeId(String v) { this.tprojThemeId = v; }
    public String getTprojProposalName() { return tprojProposalName; }
    public void setTprojProposalName(String v) { this.tprojProposalName = v; }
    public String getTprojProjectTypeId() { return tprojProjectTypeId; }
    public void setTprojProjectTypeId(String v) { this.tprojProjectTypeId = v; }
    public String getTprojSubProjectId() { return tprojSubProjectId; }
    public void setTprojSubProjectId(String v) { this.tprojSubProjectId = v; }
    public String getTprojSdgId() { return tprojSdgId; }
    public void setTprojSdgId(String v) { this.tprojSdgId = v; }
    public String getTprojScheduleSevenId() { return tprojScheduleSevenId; }
    public void setTprojScheduleSevenId(String v) { this.tprojScheduleSevenId = v; }
    public Double getTprojAllocateBudgetAmount() { return tprojAllocateBudgetAmount; }
    public void setTprojAllocateBudgetAmount(Double v) { this.tprojAllocateBudgetAmount = v; }
    public Double getTprojUtilizedTillToday() { return tprojUtilizedTillToday; }
    public void setTprojUtilizedTillToday(Double v) { this.tprojUtilizedTillToday = v; }
    public String getTprojFlArchive() { return tprojFlArchive; }
    public void setTprojFlArchive(String v) { this.tprojFlArchive = v; }
    public Long getTprojCreatedBy() { return tprojCreatedBy; }
    public void setTprojCreatedBy(Long v) { this.tprojCreatedBy = v; }
    public Long getTprojUpdatedBy() { return tprojUpdatedBy; }
    public void setTprojUpdatedBy(Long v) { this.tprojUpdatedBy = v; }
    public LocalDateTime getTprojCreatedAt() { return tprojCreatedAt; }
    public void setTprojCreatedAt(LocalDateTime v) { this.tprojCreatedAt = v; }
    public LocalDateTime getTprojUpdatedAt() { return tprojUpdatedAt; }
    public void setTprojUpdatedAt(LocalDateTime v) { this.tprojUpdatedAt = v; }
    public LocalDateTime getTprojDeletedAt() { return tprojDeletedAt; }
    public void setTprojDeletedAt(LocalDateTime v) { this.tprojDeletedAt = v; }
    public String getTprojStatus() { return tprojStatus; }
    public void setTprojStatus(String v) { this.tprojStatus = v; }
    public String getTprojUniqueId() { return tprojUniqueId; }
    public void setTprojUniqueId(String v) { this.tprojUniqueId = v; }
}