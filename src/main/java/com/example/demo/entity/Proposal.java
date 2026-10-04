package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_proposal")
public class Proposal {

    @Id
    @Column(name = "tpros_id", length = 255, nullable = false)
    private String tprosId;

    @Column(name = "tpros_financial_year_id", length = 255)
    private String tprosFinancialYearId;

    @Column(name = "tpros_proposal_name", length = 255)
    private String tprosProposalName;

    @Column(name = "tpros_current_date")
    private LocalDate tprosCurrentDate;

    @Column(name = "tpros_nature_of_the_project", length = 255)
    private String tprosNatureOfTheProject;

    @Column(name = "tpros_project_type", length = 255)
    private String tprosProjectType;

    @Column(name = "tpros_ngo_engagement", length = 255)
    private String tprosNgoEngagement;

    @Column(name = "tpros_description", columnDefinition = "text")
    private String tprosDescription;

    @Column(name = "tpros_base_project_year", length = 255)
    private String tprosBaseProjectYear;

    @Column(name = "tpros_project_value")
    private Long tprosProjectValue;

    @Column(name = "tpros_date_of_the_program")
    private LocalDateTime tprosDateOfTheProgram;

    @Column(name = "tpros_start_date")
    private LocalDateTime tprosStartDate;

    @Column(name = "tpros_end_date")
    private LocalDateTime tprosEndDate;

    @Column(name = "tpros_frequency", length = 255)
    private String tprosFrequency;

    @Column(name = "tpros_state", length = 100)
    private String tprosState;

    @Column(name = "tpros_district", length = 100)
    private String tprosDistrict;

    @Column(name = "tpros_sub_district", length = 100)
    private String tprosSubDistrict;

    @Column(name = "tpros_location", length = 100)
    private String tprosLocation;

    @Column(name = "tpros_gps_latitude")
    private Double tprosGpsLatitude;

    @Column(name = "tpros_gps_longitude")
    private Double tprosGpsLongitude;

    @Column(name = "tpros_is_aspirational_district", length = 100)
    private String tprosIsAspirationalDistrict;

    @Column(name = "tpros_is_gromor_village", length = 100)
    private String tprosIsGromorVillage;

    @Column(name = "tpros_schedule_seven", length = 100)
    private String tprosScheduleSeven;

    @Column(name = "tpros_sdg", length = 100)
    private String tprosSdg;

    @Column(name = "tpros_org_unit", length = 255)
    private String tprosOrgUnit;

    @Column(name = "tpros_bu", length = 255)
    private String tprosBu;

    @Column(name = "tpros_thematic_area", length = 100)
    private String tprosThematicArea;

    @Column(name = "tpros_gl_code", length = 255)
    private String tprosGlCode;

    @Column(name = "tpros_profit_center", length = 255)
    private String tprosProfitCenter;

    @Column(name = "tpros_cost_center", length = 255)
    private String tprosCostCenter;

    @Column(name = "tpros_target_beneficiaries", length = 100)
    private String tprosTargetBeneficiaries;

    @Column(name = "tpros_male_beneficiaries")
    private Integer tprosMaleBeneficiaries;

    @Column(name = "tpros_female_beneficiaries")
    private Integer tprosFemaleBeneficiaries;

    @Column(name = "tpros_mix_group_beneficiaries")
    private Integer tprosMixGroupBeneficiaries;

    @Column(name = "tpros_type_of_the_project", length = 100)
    private String tprosTypeOfTheProject;

    @Column(name = "tpros_type_of_the_sub_project", length = 100)
    private String tprosTypeOfTheSubProject;

    @Column(name = "tpros_approved_line_item", columnDefinition = "text")
    private String tprosApprovedLineItem;

    @Column(name = "tpros_allocate_budget_for_approved_line_item")
    private Double tprosAllocateBudgetForApprovedLineItem;

    @Column(name = "tpros_utilized_till_date")
    private Double tprosUtilizedTillDate;

    @Column(name = "tpros_project_budget")
    private Double tprosProjectBudget;

    @Column(name = "tpros_implementation_by", length = 255)
    private String tprosImplementationBy;

    @Column(name = "tpros_implementation_partner_name", length = 255)
    private String tprosImplementationPartnerName;

    @Column(name = "tpros_ngo_compliance_check", length = 255)
    private String tprosNgoComplianceCheck;

    @Column(name = "tpros_vendor_compliance_check", length = 255)
    private String tprosVendorComplianceCheck;

    @Column(name = "tpros_program_background", length = 255)
    private String tprosProgramBackground;

    @Column(name = "tpros_baseline_data_information", length = 255)
    private String tprosBaselineDataInformation;

    @Column(name = "tpros_proposal_details", length = 255)
    private String tprosProposalDetails;

    @Column(name = "tpros_govt_scheme_linkage", length = 255)
    private String tprosGovtSchemeLinkage;

    @Column(name = "tpros_stakeholder_request_level", length = 255)
    private String tprosStakeholderRequestLevel;

    @Column(name = "tpros_government_approval", length = 255)
    private String tprosGovernmentApproval;

    @Column(name = "tpros_program_objective", length = 255)
    private String tprosProgramObjective;

    @Column(name = "tpros_activities_planned", length = 255)
    private String tprosActivitiesPlanned;

    @Column(name = "tpros_expected_outcome", length = 255)
    private String tprosExpectedOutcome;

    @Column(name = "tpros_project_uniqueness", length = 255)
    private String tprosProjectUniqueness;

    @Column(name = "tpros_branding_communication", length = 255)
    private String tprosBrandingCommunication;

    @Column(name = "tpros_monitoring_scope", length = 255)
    private String tprosMonitoringScope;

    @Column(name = "tpros_budget_breakup")
    private Long tprosBudgetBreakup;

    @Column(name = "tpros_particular", length = 255)
    private String tprosParticular;

    @Column(name = "tpros_unit", length = 255)
    private String tprosUnit;

    @Column(name = "tpros_no_of_units")
    private Integer tprosNoOfUnits;

    @Column(name = "tpros_unit_cost")
    private Integer tprosUnitCost;

    @Column(name = "tpros_total_amount")
    private Double tprosTotalAmount;

    @Column(name = "tpros_gst_amount")
    private Double tprosGstAmount;

    @Column(name = "tpros_total_incl_gst")
    private Double tprosTotalInclGst;

    @Column(name = "tpros_capex_cost")
    private Double tprosCapexCost;

    @Column(name = "tpros_opex_cost")
    private Double tprosOpexCost;

    @Column(name = "tpros_service_charges")
    private Double tprosServiceCharges;

    @Column(name = "tpros_tax_details")
    private Double tprosTaxDetails;

    @Column(name = "tpros_total_project_cost")
    private Double tprosTotalProjectCost;

    @Column(name = "tpros_status", length = 255)
    private String tprosStatus = "draft";

    @Column(name = "tpros_approval_order")
    private Integer tprosApprovalOrder;

    @Column(name = "tpros_approval_type", length = 255)
    private String tprosApprovalType;

    @Column(name = "tpros_fl_archive", length = 1)
    private String tprosFlArchive = "N";

    @Column(name = "tpros_created_by")
    private Long tprosCreatedBy = 0L;

    @Column(name = "tpros_updated_by")
    private Long tprosUpdatedBy = 0L;

    @Column(name = "tpros_created_at")
    private LocalDateTime tprosCreatedAt;

    @Column(name = "tpros_updated_at")
    private LocalDateTime tprosUpdatedAt;

    @Column(name = "tpros_deleted_at")
    private LocalDateTime tprosDeletedAt;

    @Column(name = "tpros_l1_party_budget", length = 255)
    private String tprosL1PartyBudget;

    @Column(name = "tpros_recommended_party", length = 255)
    private String tprosRecommendedParty;

    @Column(name = "tpros_justification_other_than_l1", columnDefinition = "text")
    private String tprosJustificationOtherThanL1;

    @Column(name = "tpros_single_party_justification", columnDefinition = "text")
    private String tprosSinglePartyJustification;

    @Column(name = "tpros_remarks", columnDefinition = "text")
    private String tprosRemarks;

    @Column(name = "tpros_approver_index")
    private Integer tprosApproverIndex;

    @Column(name = "tpros_user_role_id")
    private String tprosUserRoleId;

    @Column(name = "tpros_approval_id")
    private String tprosApprovalId;

    @Column(name = "tpros_not_type")
    private String tprosNotType;

    @Column(name = "tpros_factory_id", length = 255)
    private String tprosFactoryId;

    @Column(name = "tpros_sub_schedule", length = 255)
    private String tprosSubSchedule;

    @Column(name = "tpros_domain_id", length = 255)
    private String tprosDomainId;

    @Column(name = "tpros_ngo_id")
    private String tprosNgoId;

    @Column(name = "tpros_forward")
    private String tprosForward;

    @Column(name = "tpros_department_id")
    private String tprosDepartmentId;

    @Column(name = "tpros_forwarded_to_department")
    private String tprosForwardedToDepartment;

    @Column(name = "tpros_forward_sequence")
    private Integer tprosForwardSequence;

    @Column(name = "tpros_forward_role_id")
    private String tprosForwardRoleId;

    @Column(name = "tpros_forward_user_id")
    private Long tprosForwardUserId;

    @Column(name = "tpros_back_forward_role_id")
    private String tprosBackForwardRoleId;

    @Column(name = "tpros_back_forward_user_id")
    private Long tprosBackForwardUserId;

    @Column(name = "tpros_user_id")
    private Long tprosUserId;


    public String getTprosId() {
        return tprosId;
    }

    public void setTprosId(String tprosId) {
        this.tprosId = tprosId;
    }

    public String getTprosFinancialYearId() {
        return tprosFinancialYearId;
    }

    public void setTprosFinancialYearId(String tprosFinancialYearId) {
        this.tprosFinancialYearId = tprosFinancialYearId;
    }

    public String getTprosProposalName() {
        return tprosProposalName;
    }

    public void setTprosProposalName(String tprosProposalName) {
        this.tprosProposalName = tprosProposalName;
    }

    public LocalDate getTprosCurrentDate() {
        return tprosCurrentDate;
    }

    public void setTprosCurrentDate(LocalDate tprosCurrentDate) {
        this.tprosCurrentDate = tprosCurrentDate;
    }

    public String getTprosNatureOfTheProject() {
        return tprosNatureOfTheProject;
    }

    public void setTprosNatureOfTheProject(String tprosNatureOfTheProject) {
        this.tprosNatureOfTheProject = tprosNatureOfTheProject;
    }

    public String getTprosProjectType() {
        return tprosProjectType;
    }

    public void setTprosProjectType(String tprosProjectType) {
        this.tprosProjectType = tprosProjectType;
    }

    public String getTprosNgoEngagement() {
        return tprosNgoEngagement;
    }

    public void setTprosNgoEngagement(String tprosNgoEngagement) {
        this.tprosNgoEngagement = tprosNgoEngagement;
    }

    public String getTprosDescription() {
        return tprosDescription;
    }

    public void setTprosDescription(String tprosDescription) {
        this.tprosDescription = tprosDescription;
    }

    public String getTprosBaseProjectYear() {
        return tprosBaseProjectYear;
    }

    public void setTprosBaseProjectYear(String tprosBaseProjectYear) {
        this.tprosBaseProjectYear = tprosBaseProjectYear;
    }

    public Long getTprosProjectValue() {
        return tprosProjectValue;
    }

    public void setTprosProjectValue(Long tprosProjectValue) {
        this.tprosProjectValue = tprosProjectValue;
    }

    public LocalDateTime getTprosDateOfTheProgram() {
        return tprosDateOfTheProgram;
    }

    public void setTprosDateOfTheProgram(LocalDateTime tprosDateOfTheProgram) {
        this.tprosDateOfTheProgram = tprosDateOfTheProgram;
    }

    public LocalDateTime getTprosStartDate() {
        return tprosStartDate;
    }

    public void setTprosStartDate(LocalDateTime tprosStartDate) {
        this.tprosStartDate = tprosStartDate;
    }

    public LocalDateTime getTprosEndDate() {
        return tprosEndDate;
    }

    public void setTprosEndDate(LocalDateTime tprosEndDate) {
        this.tprosEndDate = tprosEndDate;
    }

    public String getTprosFrequency() {
        return tprosFrequency;
    }

    public void setTprosFrequency(String tprosFrequency) {
        this.tprosFrequency = tprosFrequency;
    }

    public String getTprosState() {
        return tprosState;
    }

    public void setTprosState(String tprosState) {
        this.tprosState = tprosState;
    }

    public String getTprosDistrict() {
        return tprosDistrict;
    }

    public void setTprosDistrict(String tprosDistrict) {
        this.tprosDistrict = tprosDistrict;
    }

    public String getTprosSubDistrict() {
        return tprosSubDistrict;
    }

    public void setTprosSubDistrict(String tprosSubDistrict) {
        this.tprosSubDistrict = tprosSubDistrict;
    }

    public String getTprosLocation() {
        return tprosLocation;
    }

    public void setTprosLocation(String tprosLocation) {
        this.tprosLocation = tprosLocation;
    }

    public Double getTprosGpsLatitude() {
        return tprosGpsLatitude;
    }

    public void setTprosGpsLatitude(Double tprosGpsLatitude) {
        this.tprosGpsLatitude = tprosGpsLatitude;
    }

    public Double getTprosGpsLongitude() {
        return tprosGpsLongitude;
    }

    public void setTprosGpsLongitude(Double tprosGpsLongitude) {
        this.tprosGpsLongitude = tprosGpsLongitude;
    }

    public String getTprosIsAspirationalDistrict() {
        return tprosIsAspirationalDistrict;
    }

    public void setTprosIsAspirationalDistrict(String tprosIsAspirationalDistrict) {
        this.tprosIsAspirationalDistrict = tprosIsAspirationalDistrict;
    }

    public String getTprosIsGromorVillage() {
        return tprosIsGromorVillage;
    }

    public void setTprosIsGromorVillage(String tprosIsGromorVillage) {
        this.tprosIsGromorVillage = tprosIsGromorVillage;
    }

    public String getTprosScheduleSeven() {
        return tprosScheduleSeven;
    }

    public void setTprosScheduleSeven(String tprosScheduleSeven) {
        this.tprosScheduleSeven = tprosScheduleSeven;
    }

    public String getTprosSdg() {
        return tprosSdg;
    }

    public void setTprosSdg(String tprosSdg) {
        this.tprosSdg = tprosSdg;
    }

    public String getTprosOrgUnit() {
        return tprosOrgUnit;
    }

    public void setTprosOrgUnit(String tprosOrgUnit) {
        this.tprosOrgUnit = tprosOrgUnit;
    }

    public String getTprosBu() {
        return tprosBu;
    }

    public void setTprosBu(String tprosBu) {
        this.tprosBu = tprosBu;
    }

    public String getTprosThematicArea() {
        return tprosThematicArea;
    }

    public void setTprosThematicArea(String tprosThematicArea) {
        this.tprosThematicArea = tprosThematicArea;
    }

    public String getTprosGlCode() {
        return tprosGlCode;
    }

    public void setTprosGlCode(String tprosGlCode) {
        this.tprosGlCode = tprosGlCode;
    }

    public String getTprosProfitCenter() {
        return tprosProfitCenter;
    }

    public void setTprosProfitCenter(String tprosProfitCenter) {
        this.tprosProfitCenter = tprosProfitCenter;
    }

    public String getTprosCostCenter() {
        return tprosCostCenter;
    }

    public void setTprosCostCenter(String tprosCostCenter) {
        this.tprosCostCenter = tprosCostCenter;
    }

    public String getTprosTargetBeneficiaries() {
        return tprosTargetBeneficiaries;
    }

    public void setTprosTargetBeneficiaries(String tprosTargetBeneficiaries) {
        this.tprosTargetBeneficiaries = tprosTargetBeneficiaries;
    }

    public Integer getTprosMaleBeneficiaries() {
        return tprosMaleBeneficiaries;
    }

    public void setTprosMaleBeneficiaries(Integer tprosMaleBeneficiaries) {
        this.tprosMaleBeneficiaries = tprosMaleBeneficiaries;
    }

    public Integer getTprosFemaleBeneficiaries() {
        return tprosFemaleBeneficiaries;
    }

    public void setTprosFemaleBeneficiaries(Integer tprosFemaleBeneficiaries) {
        this.tprosFemaleBeneficiaries = tprosFemaleBeneficiaries;
    }

    public Integer getTprosMixGroupBeneficiaries() {
        return tprosMixGroupBeneficiaries;
    }

    public void setTprosMixGroupBeneficiaries(Integer tprosMixGroupBeneficiaries) {
        this.tprosMixGroupBeneficiaries = tprosMixGroupBeneficiaries;
    }

    public String getTprosTypeOfTheProject() {
        return tprosTypeOfTheProject;
    }

    public void setTprosTypeOfTheProject(String tprosTypeOfTheProject) {
        this.tprosTypeOfTheProject = tprosTypeOfTheProject;
    }

    public String getTprosTypeOfTheSubProject() {
        return tprosTypeOfTheSubProject;
    }

    public void setTprosTypeOfTheSubProject(String tprosTypeOfTheSubProject) {
        this.tprosTypeOfTheSubProject = tprosTypeOfTheSubProject;
    }

    public String getTprosApprovedLineItem() {
        return tprosApprovedLineItem;
    }

    public void setTprosApprovedLineItem(String tprosApprovedLineItem) {
        this.tprosApprovedLineItem = tprosApprovedLineItem;
    }

    public Double getTprosAllocateBudgetForApprovedLineItem() {
        return tprosAllocateBudgetForApprovedLineItem;
    }

    public void setTprosAllocateBudgetForApprovedLineItem(Double tprosAllocateBudgetForApprovedLineItem) {
        this.tprosAllocateBudgetForApprovedLineItem = tprosAllocateBudgetForApprovedLineItem;
    }

    public Double getTprosUtilizedTillDate() {
        return tprosUtilizedTillDate;
    }

    public void setTprosUtilizedTillDate(Double tprosUtilizedTillDate) {
        this.tprosUtilizedTillDate = tprosUtilizedTillDate;
    }

    public Double getTprosProjectBudget() {
        return tprosProjectBudget;
    }

    public void setTprosProjectBudget(Double tprosProjectBudget) {
        this.tprosProjectBudget = tprosProjectBudget;
    }

    public String getTprosImplementationBy() {
        return tprosImplementationBy;
    }

    public void setTprosImplementationBy(String tprosImplementationBy) {
        this.tprosImplementationBy = tprosImplementationBy;
    }

    public String getTprosImplementationPartnerName() {
        return tprosImplementationPartnerName;
    }

    public void setTprosImplementationPartnerName(String tprosImplementationPartnerName) {
        this.tprosImplementationPartnerName = tprosImplementationPartnerName;
    }

    public String getTprosNgoComplianceCheck() {
        return tprosNgoComplianceCheck;
    }

    public void setTprosNgoComplianceCheck(String tprosNgoComplianceCheck) {
        this.tprosNgoComplianceCheck = tprosNgoComplianceCheck;
    }

    public String getTprosVendorComplianceCheck() {
        return tprosVendorComplianceCheck;
    }

    public void setTprosVendorComplianceCheck(String tprosVendorComplianceCheck) {
        this.tprosVendorComplianceCheck = tprosVendorComplianceCheck;
    }

    public String getTprosProgramBackground() {
        return tprosProgramBackground;
    }

    public void setTprosProgramBackground(String tprosProgramBackground) {
        this.tprosProgramBackground = tprosProgramBackground;
    }

    public String getTprosBaselineDataInformation() {
        return tprosBaselineDataInformation;
    }

    public void setTprosBaselineDataInformation(String tprosBaselineDataInformation) {
        this.tprosBaselineDataInformation = tprosBaselineDataInformation;
    }

    public String getTprosProposalDetails() {
        return tprosProposalDetails;
    }

    public void setTprosProposalDetails(String tprosProposalDetails) {
        this.tprosProposalDetails = tprosProposalDetails;
    }

    public String getTprosGovtSchemeLinkage() {
        return tprosGovtSchemeLinkage;
    }

    public void setTprosGovtSchemeLinkage(String tprosGovtSchemeLinkage) {
        this.tprosGovtSchemeLinkage = tprosGovtSchemeLinkage;
    }

    public String getTprosStakeholderRequestLevel() {
        return tprosStakeholderRequestLevel;
    }

    public void setTprosStakeholderRequestLevel(String tprosStakeholderRequestLevel) {
        this.tprosStakeholderRequestLevel = tprosStakeholderRequestLevel;
    }

    public String getTprosGovernmentApproval() {
        return tprosGovernmentApproval;
    }

    public void setTprosGovernmentApproval(String tprosGovernmentApproval) {
        this.tprosGovernmentApproval = tprosGovernmentApproval;
    }

    public String getTprosProgramObjective() {
        return tprosProgramObjective;
    }

    public void setTprosProgramObjective(String tprosProgramObjective) {
        this.tprosProgramObjective = tprosProgramObjective;
    }

    public String getTprosActivitiesPlanned() {
        return tprosActivitiesPlanned;
    }

    public void setTprosActivitiesPlanned(String tprosActivitiesPlanned) {
        this.tprosActivitiesPlanned = tprosActivitiesPlanned;
    }

    public String getTprosExpectedOutcome() {
        return tprosExpectedOutcome;
    }

    public void setTprosExpectedOutcome(String tprosExpectedOutcome) {
        this.tprosExpectedOutcome = tprosExpectedOutcome;
    }

    public String getTprosProjectUniqueness() {
        return tprosProjectUniqueness;
    }

    public void setTprosProjectUniqueness(String tprosProjectUniqueness) {
        this.tprosProjectUniqueness = tprosProjectUniqueness;
    }

    public String getTprosBrandingCommunication() {
        return tprosBrandingCommunication;
    }

    public void setTprosBrandingCommunication(String tprosBrandingCommunication) {
        this.tprosBrandingCommunication = tprosBrandingCommunication;
    }

    public String getTprosMonitoringScope() {
        return tprosMonitoringScope;
    }

    public void setTprosMonitoringScope(String tprosMonitoringScope) {
        this.tprosMonitoringScope = tprosMonitoringScope;
    }

    public Long getTprosBudgetBreakup() {
        return tprosBudgetBreakup;
    }

    public void setTprosBudgetBreakup(Long tprosBudgetBreakup) {
        this.tprosBudgetBreakup = tprosBudgetBreakup;
    }

    public String getTprosParticular() {
        return tprosParticular;
    }

    public void setTprosParticular(String tprosParticular) {
        this.tprosParticular = tprosParticular;
    }

    public String getTprosUnit() {
        return tprosUnit;
    }

    public void setTprosUnit(String tprosUnit) {
        this.tprosUnit = tprosUnit;
    }

    public Integer getTprosNoOfUnits() {
        return tprosNoOfUnits;
    }

    public void setTprosNoOfUnits(Integer tprosNoOfUnits) {
        this.tprosNoOfUnits = tprosNoOfUnits;
    }

    public Integer getTprosUnitCost() {
        return tprosUnitCost;
    }

    public void setTprosUnitCost(Integer tprosUnitCost) {
        this.tprosUnitCost = tprosUnitCost;
    }

    public Double getTprosTotalAmount() {
        return tprosTotalAmount;
    }

    public void setTprosTotalAmount(Double tprosTotalAmount) {
        this.tprosTotalAmount = tprosTotalAmount;
    }

    public Double getTprosGstAmount() {
        return tprosGstAmount;
    }

    public void setTprosGstAmount(Double tprosGstAmount) {
        this.tprosGstAmount = tprosGstAmount;
    }

    public Double getTprosTotalInclGst() {
        return tprosTotalInclGst;
    }

    public void setTprosTotalInclGst(Double tprosTotalInclGst) {
        this.tprosTotalInclGst = tprosTotalInclGst;
    }

    public Double getTprosCapexCost() {
        return tprosCapexCost;
    }

    public void setTprosCapexCost(Double tprosCapexCost) {
        this.tprosCapexCost = tprosCapexCost;
    }

    public Double getTprosOpexCost() {
        return tprosOpexCost;
    }

    public void setTprosOpexCost(Double tprosOpexCost) {
        this.tprosOpexCost = tprosOpexCost;
    }

    public Double getTprosServiceCharges() {
        return tprosServiceCharges;
    }

    public void setTprosServiceCharges(Double tprosServiceCharges) {
        this.tprosServiceCharges = tprosServiceCharges;
    }

    public Double getTprosTaxDetails() {
        return tprosTaxDetails;
    }

    public void setTprosTaxDetails(Double tprosTaxDetails) {
        this.tprosTaxDetails = tprosTaxDetails;
    }

    public Double getTprosTotalProjectCost() {
        return tprosTotalProjectCost;
    }

    public void setTprosTotalProjectCost(Double tprosTotalProjectCost) {
        this.tprosTotalProjectCost = tprosTotalProjectCost;
    }

    public String getTprosStatus() {
        return tprosStatus;
    }

    public void setTprosStatus(String tprosStatus) {
        this.tprosStatus = tprosStatus;
    }

    public Integer getTprosApprovalOrder() {
        return tprosApprovalOrder;
    }

    public void setTprosApprovalOrder(Integer tprosApprovalOrder) {
        this.tprosApprovalOrder = tprosApprovalOrder;
    }

    public String getTprosApprovalType() {
        return tprosApprovalType;
    }

    public void setTprosApprovalType(String tprosApprovalType) {
        this.tprosApprovalType = tprosApprovalType;
    }

    public String getTprosFlArchive() {
        return tprosFlArchive;
    }

    public void setTprosFlArchive(String tprosFlArchive) {
        this.tprosFlArchive = tprosFlArchive;
    }

    public Long getTprosCreatedBy() {
        return tprosCreatedBy;
    }

    public void setTprosCreatedBy(Long tprosCreatedBy) {
        this.tprosCreatedBy = tprosCreatedBy;
    }

    public Long getTprosUpdatedBy() {
        return tprosUpdatedBy;
    }

    public void setTprosUpdatedBy(Long tprosUpdatedBy) {
        this.tprosUpdatedBy = tprosUpdatedBy;
    }

    public LocalDateTime getTprosCreatedAt() {
        return tprosCreatedAt;
    }

    public void setTprosCreatedAt(LocalDateTime tprosCreatedAt) {
        this.tprosCreatedAt = tprosCreatedAt;
    }

    public LocalDateTime getTprosUpdatedAt() {
        return tprosUpdatedAt;
    }

    public void setTprosUpdatedAt(LocalDateTime tprosUpdatedAt) {
        this.tprosUpdatedAt = tprosUpdatedAt;
    }

    public LocalDateTime getTprosDeletedAt() {
        return tprosDeletedAt;
    }

    public void setTprosDeletedAt(LocalDateTime tprosDeletedAt) {
        this.tprosDeletedAt = tprosDeletedAt;
    }

    public String getTprosL1PartyBudget() {
        return tprosL1PartyBudget;
    }

    public void setTprosL1PartyBudget(String tprosL1PartyBudget) {
        this.tprosL1PartyBudget = tprosL1PartyBudget;
    }

    public String getTprosRecommendedParty() {
        return tprosRecommendedParty;
    }

    public void setTprosRecommendedParty(String tprosRecommendedParty) {
        this.tprosRecommendedParty = tprosRecommendedParty;
    }

    public String getTprosJustificationOtherThanL1() {
        return tprosJustificationOtherThanL1;
    }

    public void setTprosJustificationOtherThanL1(String tprosJustificationOtherThanL1) {
        this.tprosJustificationOtherThanL1 = tprosJustificationOtherThanL1;
    }

    public String getTprosSinglePartyJustification() {
        return tprosSinglePartyJustification;
    }

    public void setTprosSinglePartyJustification(String tprosSinglePartyJustification) {
        this.tprosSinglePartyJustification = tprosSinglePartyJustification;
    }

    public String getTprosRemarks() {
        return tprosRemarks;
    }

    public void setTprosRemarks(String tprosRemarks) {
        this.tprosRemarks = tprosRemarks;
    }

    public Integer getTprosApproverIndex() {
        return tprosApproverIndex;
    }

    public void setTprosApproverIndex(Integer tprosApproverIndex) {
        this.tprosApproverIndex = tprosApproverIndex;
    }

    public String getTprosUserRoleId() {
        return tprosUserRoleId;
    }

    public void setTprosUserRoleId(String tprosUserRoleId) {
        this.tprosUserRoleId = tprosUserRoleId;
    }

    public String getTprosApprovalId() {
        return tprosApprovalId;
    }

    public void setTprosApprovalId(String tprosApprovalId) {
        this.tprosApprovalId = tprosApprovalId;
    }

    public String getTprosNotType() {
        return tprosNotType;
    }

    public void setTprosNotType(String tprosNotType) {
        this.tprosNotType = tprosNotType;
    }

    public String getTprosFactoryId() {
        return tprosFactoryId;
    }

    public void setTprosFactoryId(String tprosFactoryId) {
        this.tprosFactoryId = tprosFactoryId;
    }

    public String getTprosSubSchedule() {
        return tprosSubSchedule;
    }

    public void setTprosSubSchedule(String tprosSubSchedule) {
        this.tprosSubSchedule = tprosSubSchedule;
    }

    public String getTprosDomainId() {
        return tprosDomainId;
    }

    public void setTprosDomainId(String tprosDomainId) {
        this.tprosDomainId = tprosDomainId;
    }

    public String getTprosNgoId() {
        return tprosNgoId;
    }

    public void setTprosNgoId(String tprosNgoId) {
        this.tprosNgoId = tprosNgoId;
    }

    public String getTprosForward() {
        return tprosForward;
    }

    public void setTprosForward(String tprosForward) {
        this.tprosForward = tprosForward;
    }

    public String getTprosDepartmentId() {
        return tprosDepartmentId;
    }

    public void setTprosDepartmentId(String tprosDepartmentId) {
        this.tprosDepartmentId = tprosDepartmentId;
    }

    public String getTprosForwardedToDepartment() {
        return tprosForwardedToDepartment;
    }

    public void setTprosForwardedToDepartment(String tprosForwardedToDepartment) {
        this.tprosForwardedToDepartment = tprosForwardedToDepartment;
    }

    public Integer getTprosForwardSequence() {
        return tprosForwardSequence;
    }

    public void setTprosForwardSequence(Integer tprosForwardSequence) {
        this.tprosForwardSequence = tprosForwardSequence;
    }

    public String getTprosForwardRoleId() {
        return tprosForwardRoleId;
    }

    public void setTprosForwardRoleId(String tprosForwardRoleId) {
        this.tprosForwardRoleId = tprosForwardRoleId;
    }

    public Long getTprosForwardUserId() {
        return tprosForwardUserId;
    }

    public void setTprosForwardUserId(Long tprosForwardUserId) {
        this.tprosForwardUserId = tprosForwardUserId;
    }

    public String getTprosBackForwardRoleId() {
        return tprosBackForwardRoleId;
    }

    public void setTprosBackForwardRoleId(String tprosBackForwardRoleId) {
        this.tprosBackForwardRoleId = tprosBackForwardRoleId;
    }

    public Long getTprosBackForwardUserId() {
        return tprosBackForwardUserId;
    }

    public void setTprosBackForwardUserId(Long tprosBackForwardUserId) {
        this.tprosBackForwardUserId = tprosBackForwardUserId;
    }

    public Long getTprosUserId() {
        return tprosUserId;
    }

    public void setTprosUserId(Long tprosUserId) {
        this.tprosUserId = tprosUserId;
    }
}