package com.example.demo.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class BudgetMasterRequest {

    @NotBlank(message = "Type is required")
    private String type;

    @NotBlank(message = "Financial year id is required")
    private String fyId;

    @NotBlank(message = "Domain id is required")
    private String domainId;

    private String plantId;
    private String buId;

    @NotBlank(message = "State id is required")
    private String stateId;

    private String districtId;
    private String blockId;
    private String glCode;
    private String profitCenter;
    private String natureOfProject;

    @NotBlank(message = "Project concise is required")
    private String projectConcise;

    private String projectDuration;
    private String nationalIndicatorFramework;

    @NotNull(message = "Total budget amount is required")
    @DecimalMin(value = "0.0", message = "Total budget amount cannot be negative")
    private Double totalBudgetAmount;

    private String budgetList;   // line items as a JSON string
    private String themeId;
    private String departmentId;

    // getters and setters for every field
    public String getType() { return type; }
    public void setType(String v) { this.type = v; }
    public String getFyId() { return fyId; }
    public void setFyId(String v) { this.fyId = v; }
    public String getDomainId() { return domainId; }
    public void setDomainId(String v) { this.domainId = v; }
    public String getPlantId() { return plantId; }
    public void setPlantId(String v) { this.plantId = v; }
    public String getBuId() { return buId; }
    public void setBuId(String v) { this.buId = v; }
    public String getStateId() { return stateId; }
    public void setStateId(String v) { this.stateId = v; }
    public String getDistrictId() { return districtId; }
    public void setDistrictId(String v) { this.districtId = v; }
    public String getBlockId() { return blockId; }
    public void setBlockId(String v) { this.blockId = v; }
    public String getGlCode() { return glCode; }
    public void setGlCode(String v) { this.glCode = v; }
    public String getProfitCenter() { return profitCenter; }
    public void setProfitCenter(String v) { this.profitCenter = v; }
    public String getNatureOfProject() { return natureOfProject; }
    public void setNatureOfProject(String v) { this.natureOfProject = v; }
    public String getProjectConcise() { return projectConcise; }
    public void setProjectConcise(String v) { this.projectConcise = v; }
    public String getProjectDuration() { return projectDuration; }
    public void setProjectDuration(String v) { this.projectDuration = v; }
    public String getNationalIndicatorFramework() { return nationalIndicatorFramework; }
    public void setNationalIndicatorFramework(String v) { this.nationalIndicatorFramework = v; }
    public Double getTotalBudgetAmount() { return totalBudgetAmount; }
    public void setTotalBudgetAmount(Double v) { this.totalBudgetAmount = v; }
    public String getBudgetList() { return budgetList; }
    public void setBudgetList(String v) { this.budgetList = v; }
    public String getThemeId() { return themeId; }
    public void setThemeId(String v) { this.themeId = v; }
    public String getDepartmentId() { return departmentId; }
    public void setDepartmentId(String v) { this.departmentId = v; }
}