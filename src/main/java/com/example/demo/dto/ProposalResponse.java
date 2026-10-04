package com.example.demo.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ProposalResponse {

    private String id;
    private String financialYearId;
    private String proposalName;
    private LocalDate currentDate;
    private String natureOfTheProject;
    private String projectType;
    private String ngoEngagement;
    private String description;
    private String baseProjectYear;
    private Long projectValue;
    private LocalDateTime dateOfTheProgram;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String frequency;
    private String state;
    private String district;
    private String subDistrict;
    private String location;
    private Double gpsLatitude;
    private Double gpsLongitude;
    private String isAspirationalDistrict;
    private String isGromorVillage;
    private String scheduleSeven;
    private String sdg;
    private String orgUnit;
    private String bu;
    private String thematicArea;
    private String glCode;
    private String profitCenter;
    private String costCenter;
    private String targetBeneficiaries;
    private Integer maleBeneficiaries;
    private Integer femaleBeneficiaries;
    private Integer mixGroupBeneficiaries;
    private String typeOfTheProject;
    private String typeOfTheSubProject;
    private String approvedLineItem;
    private Double allocateBudgetForApprovedLineItem;
    private Double utilizedTillDate;
    private Double projectBudget;
    private String implementationBy;
    private String implementationPartnerName;
    private String ngoComplianceCheck;
    private String vendorComplianceCheck;
    private String programBackground;
    private String baselineDataInformation;
    private String proposalDetails;
    private String govtSchemeLinkage;
    private String stakeholderRequestLevel;
    private String governmentApproval;
    private String programObjective;
    private String activitiesPlanned;
    private String expectedOutcome;
    private String projectUniqueness;
    private String brandingCommunication;
    private String monitoringScope;
    private Long budgetBreakup;
    private String particular;
    private String unit;
    private Integer noOfUnits;
    private Integer unitCost;
    private Double totalAmount;
    private Double gstAmount;
    private Double totalInclGst;
    private Double capexCost;
    private Double opexCost;
    private Double serviceCharges;
    private Double taxDetails;
    private Double totalProjectCost;
    private String status;
    private Integer approvalOrder;
    private String approvalType;
    private String flArchive;
    private Long createdBy;
    private Long updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
    private String l1PartyBudget;
    private String recommendedParty;
    private String justificationOtherThanL1;
    private String singlePartyJustification;
    private String remarks;
    private Integer approverIndex;
    private String userRoleId;
    private String approvalId;
    private String notType;
    private String factoryId;
    private String subSchedule;
    private String domainId;
    private String ngoId;
    private String forward;
    private String departmentId;
    private String forwardedToDepartment;
    private Integer forwardSequence;
    private String forwardRoleId;
    private Long forwardUserId;
    private String backForwardRoleId;
    private Long backForwardUserId;
    private Long userId;

    public ProposalResponse(
            String id,
            String financialYearId,
            String proposalName,
            LocalDate currentDate,
            String natureOfTheProject,
            String projectType,
            String ngoEngagement,
            String description,
            String baseProjectYear,
            Long projectValue,
            LocalDateTime dateOfTheProgram,
            LocalDateTime startDate,
            LocalDateTime endDate,
            String frequency,
            String state,
            String district,
            String subDistrict,
            String location,
            Double gpsLatitude,
            Double gpsLongitude,
            String isAspirationalDistrict,
            String isGromorVillage,
            String scheduleSeven,
            String sdg,
            String orgUnit,
            String bu,
            String thematicArea,
            String glCode,
            String profitCenter,
            String costCenter,
            String targetBeneficiaries,
            Integer maleBeneficiaries,
            Integer femaleBeneficiaries,
            Integer mixGroupBeneficiaries,
            String typeOfTheProject,
            String typeOfTheSubProject,
            String approvedLineItem,
            Double allocateBudgetForApprovedLineItem,
            Double utilizedTillDate,
            Double projectBudget,
            String implementationBy,
            String implementationPartnerName,
            String ngoComplianceCheck,
            String vendorComplianceCheck,
            String programBackground,
            String baselineDataInformation,
            String proposalDetails,
            String govtSchemeLinkage,
            String stakeholderRequestLevel,
            String governmentApproval,
            String programObjective,
            String activitiesPlanned,
            String expectedOutcome,
            String projectUniqueness,
            String brandingCommunication,
            String monitoringScope,
            Long budgetBreakup,
            String particular,
            String unit,
            Integer noOfUnits,
            Integer unitCost,
            Double totalAmount,
            Double gstAmount,
            Double totalInclGst,
            Double capexCost,
            Double opexCost,
            Double serviceCharges,
            Double taxDetails,
            Double totalProjectCost,
            String status,
            Integer approvalOrder,
            String approvalType,
            String flArchive,
            Long createdBy,
            Long updatedBy,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            LocalDateTime deletedAt,
            String l1PartyBudget,
            String recommendedParty,
            String justificationOtherThanL1,
            String singlePartyJustification,
            String remarks,
            Integer approverIndex,
            String userRoleId,
            String approvalId,
            String notType,
            String factoryId,
            String subSchedule,
            String domainId,
            String ngoId,
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
        this.financialYearId = financialYearId;
        this.proposalName = proposalName;
        this.currentDate = currentDate;
        this.natureOfTheProject = natureOfTheProject;
        this.projectType = projectType;
        this.ngoEngagement = ngoEngagement;
        this.description = description;
        this.baseProjectYear = baseProjectYear;
        this.projectValue = projectValue;
        this.dateOfTheProgram = dateOfTheProgram;
        this.startDate = startDate;
        this.endDate = endDate;
        this.frequency = frequency;
        this.state = state;
        this.district = district;
        this.subDistrict = subDistrict;
        this.location = location;
        this.gpsLatitude = gpsLatitude;
        this.gpsLongitude = gpsLongitude;
        this.isAspirationalDistrict = isAspirationalDistrict;
        this.isGromorVillage = isGromorVillage;
        this.scheduleSeven = scheduleSeven;
        this.sdg = sdg;
        this.orgUnit = orgUnit;
        this.bu = bu;
        this.thematicArea = thematicArea;
        this.glCode = glCode;
        this.profitCenter = profitCenter;
        this.costCenter = costCenter;
        this.targetBeneficiaries = targetBeneficiaries;
        this.maleBeneficiaries = maleBeneficiaries;
        this.femaleBeneficiaries = femaleBeneficiaries;
        this.mixGroupBeneficiaries = mixGroupBeneficiaries;
        this.typeOfTheProject = typeOfTheProject;
        this.typeOfTheSubProject = typeOfTheSubProject;
        this.approvedLineItem = approvedLineItem;
        this.allocateBudgetForApprovedLineItem = allocateBudgetForApprovedLineItem;
        this.utilizedTillDate = utilizedTillDate;
        this.projectBudget = projectBudget;
        this.implementationBy = implementationBy;
        this.implementationPartnerName = implementationPartnerName;
        this.ngoComplianceCheck = ngoComplianceCheck;
        this.vendorComplianceCheck = vendorComplianceCheck;
        this.programBackground = programBackground;
        this.baselineDataInformation = baselineDataInformation;
        this.proposalDetails = proposalDetails;
        this.govtSchemeLinkage = govtSchemeLinkage;
        this.stakeholderRequestLevel = stakeholderRequestLevel;
        this.governmentApproval = governmentApproval;
        this.programObjective = programObjective;
        this.activitiesPlanned = activitiesPlanned;
        this.expectedOutcome = expectedOutcome;
        this.projectUniqueness = projectUniqueness;
        this.brandingCommunication = brandingCommunication;
        this.monitoringScope = monitoringScope;
        this.budgetBreakup = budgetBreakup;
        this.particular = particular;
        this.unit = unit;
        this.noOfUnits = noOfUnits;
        this.unitCost = unitCost;
        this.totalAmount = totalAmount;
        this.gstAmount = gstAmount;
        this.totalInclGst = totalInclGst;
        this.capexCost = capexCost;
        this.opexCost = opexCost;
        this.serviceCharges = serviceCharges;
        this.taxDetails = taxDetails;
        this.totalProjectCost = totalProjectCost;
        this.status = status;
        this.approvalOrder = approvalOrder;
        this.approvalType = approvalType;
        this.flArchive = flArchive;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.l1PartyBudget = l1PartyBudget;
        this.recommendedParty = recommendedParty;
        this.justificationOtherThanL1 = justificationOtherThanL1;
        this.singlePartyJustification = singlePartyJustification;
        this.remarks = remarks;
        this.approverIndex = approverIndex;
        this.userRoleId = userRoleId;
        this.approvalId = approvalId;
        this.notType = notType;
        this.factoryId = factoryId;
        this.subSchedule = subSchedule;
        this.domainId = domainId;
        this.ngoId = ngoId;
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

    public String getFinancialYearId() {
        return financialYearId;
    }

    public String getProposalName() {
        return proposalName;
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public String getNatureOfTheProject() {
        return natureOfTheProject;
    }

    public String getProjectType() {
        return projectType;
    }

    public String getNgoEngagement() {
        return ngoEngagement;
    }

    public String getDescription() {
        return description;
    }

    public String getBaseProjectYear() {
        return baseProjectYear;
    }

    public Long getProjectValue() {
        return projectValue;
    }

    public LocalDateTime getDateOfTheProgram() {
        return dateOfTheProgram;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getState() {
        return state;
    }

    public String getDistrict() {
        return district;
    }

    public String getSubDistrict() {
        return subDistrict;
    }

    public String getLocation() {
        return location;
    }

    public Double getGpsLatitude() {
        return gpsLatitude;
    }

    public Double getGpsLongitude() {
        return gpsLongitude;
    }

    public String getIsAspirationalDistrict() {
        return isAspirationalDistrict;
    }

    public String getIsGromorVillage() {
        return isGromorVillage;
    }

    public String getScheduleSeven() {
        return scheduleSeven;
    }

    public String getSdg() {
        return sdg;
    }

    public String getOrgUnit() {
        return orgUnit;
    }

    public String getBu() {
        return bu;
    }

    public String getThematicArea() {
        return thematicArea;
    }

    public String getGlCode() {
        return glCode;
    }

    public String getProfitCenter() {
        return profitCenter;
    }

    public String getCostCenter() {
        return costCenter;
    }

    public String getTargetBeneficiaries() {
        return targetBeneficiaries;
    }

    public Integer getMaleBeneficiaries() {
        return maleBeneficiaries;
    }

    public Integer getFemaleBeneficiaries() {
        return femaleBeneficiaries;
    }

    public Integer getMixGroupBeneficiaries() {
        return mixGroupBeneficiaries;
    }

    public String getTypeOfTheProject() {
        return typeOfTheProject;
    }

    public String getTypeOfTheSubProject() {
        return typeOfTheSubProject;
    }

    public String getApprovedLineItem() {
        return approvedLineItem;
    }

    public Double getAllocateBudgetForApprovedLineItem() {
        return allocateBudgetForApprovedLineItem;
    }

    public Double getUtilizedTillDate() {
        return utilizedTillDate;
    }

    public Double getProjectBudget() {
        return projectBudget;
    }

    public String getImplementationBy() {
        return implementationBy;
    }

    public String getImplementationPartnerName() {
        return implementationPartnerName;
    }

    public String getNgoComplianceCheck() {
        return ngoComplianceCheck;
    }

    public String getVendorComplianceCheck() {
        return vendorComplianceCheck;
    }

    public String getProgramBackground() {
        return programBackground;
    }

    public String getBaselineDataInformation() {
        return baselineDataInformation;
    }

    public String getProposalDetails() {
        return proposalDetails;
    }

    public String getGovtSchemeLinkage() {
        return govtSchemeLinkage;
    }

    public String getStakeholderRequestLevel() {
        return stakeholderRequestLevel;
    }

    public String getGovernmentApproval() {
        return governmentApproval;
    }

    public String getProgramObjective() {
        return programObjective;
    }

    public String getActivitiesPlanned() {
        return activitiesPlanned;
    }

    public String getExpectedOutcome() {
        return expectedOutcome;
    }

    public String getProjectUniqueness() {
        return projectUniqueness;
    }

    public String getBrandingCommunication() {
        return brandingCommunication;
    }

    public String getMonitoringScope() {
        return monitoringScope;
    }

    public Long getBudgetBreakup() {
        return budgetBreakup;
    }

    public String getParticular() {
        return particular;
    }

    public String getUnit() {
        return unit;
    }

    public Integer getNoOfUnits() {
        return noOfUnits;
    }

    public Integer getUnitCost() {
        return unitCost;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public Double getGstAmount() {
        return gstAmount;
    }

    public Double getTotalInclGst() {
        return totalInclGst;
    }

    public Double getCapexCost() {
        return capexCost;
    }

    public Double getOpexCost() {
        return opexCost;
    }

    public Double getServiceCharges() {
        return serviceCharges;
    }

    public Double getTaxDetails() {
        return taxDetails;
    }

    public Double getTotalProjectCost() {
        return totalProjectCost;
    }

    public String getStatus() {
        return status;
    }

    public Integer getApprovalOrder() {
        return approvalOrder;
    }

    public String getApprovalType() {
        return approvalType;
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

    public String getL1PartyBudget() {
        return l1PartyBudget;
    }

    public String getRecommendedParty() {
        return recommendedParty;
    }

    public String getJustificationOtherThanL1() {
        return justificationOtherThanL1;
    }

    public String getSinglePartyJustification() {
        return singlePartyJustification;
    }

    public String getRemarks() {
        return remarks;
    }

    public Integer getApproverIndex() {
        return approverIndex;
    }

    public String getUserRoleId() {
        return userRoleId;
    }

    public String getApprovalId() {
        return approvalId;
    }

    public String getNotType() {
        return notType;
    }

    public String getFactoryId() {
        return factoryId;
    }

    public String getSubSchedule() {
        return subSchedule;
    }

    public String getDomainId() {
        return domainId;
    }

    public String getNgoId() {
        return ngoId;
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