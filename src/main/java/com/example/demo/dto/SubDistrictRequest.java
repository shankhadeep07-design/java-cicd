package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class SubDistrictRequest {

    @NotBlank(message = "Sub district name is required")
    private String subDistrictName;

    @NotBlank(message = "District id is required")
    private String districtId;

    public String getSubDistrictName() { return subDistrictName; }
    public void setSubDistrictName(String subDistrictName) { this.subDistrictName = subDistrictName; }

    public String getDistrictId() { return districtId; }
    public void setDistrictId(String districtId) { this.districtId = districtId; }
}