package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class DistrictRequest {

    @NotBlank(message = "District name is required")
    private String districtName;

    @NotBlank(message = "State id is required")
    private String stateId;

    public String getDistrictName() { return districtName; }
    public void setDistrictName(String districtName) { this.districtName = districtName; }

    public String getStateId() { return stateId; }
    public void setStateId(String stateId) { this.stateId = stateId; }
}