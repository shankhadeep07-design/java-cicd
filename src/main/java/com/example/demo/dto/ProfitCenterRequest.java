package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class ProfitCenterRequest {

    @NotBlank(message = "Profit centre is required")
    private String profitCentre;

    private String corporate;
    private String bu;
    private String glAccount;
    private String costCentre;

    @NotBlank(message = "State id is required")
    private String stateId;

    @NotBlank(message = "District id is required")
    private String districtId;

    private String locationId; // optional

    public String getProfitCentre() { return profitCentre; }
    public void setProfitCentre(String profitCentre) { this.profitCentre = profitCentre; }

    public String getCorporate() { return corporate; }
    public void setCorporate(String corporate) { this.corporate = corporate; }

    public String getBu() { return bu; }
    public void setBu(String bu) { this.bu = bu; }

    public String getGlAccount() { return glAccount; }
    public void setGlAccount(String glAccount) { this.glAccount = glAccount; }

    public String getCostCentre() { return costCentre; }
    public void setCostCentre(String costCentre) { this.costCentre = costCentre; }

    public String getStateId() { return stateId; }
    public void setStateId(String stateId) { this.stateId = stateId; }

    public String getDistrictId() { return districtId; }
    public void setDistrictId(String districtId) { this.districtId = districtId; }

    public String getLocationId() { return locationId; }
    public void setLocationId(String locationId) { this.locationId = locationId; }
}