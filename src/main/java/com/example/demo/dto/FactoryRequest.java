package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class FactoryRequest {

    @NotBlank(message = "Factory name is required")
    private String factoryName;

    @NotBlank(message = "State id is required")
    private String stateId;

    @NotBlank(message = "District id is required")
    private String districtId;

    @NotBlank(message = "Block id is required")
    private String blockId;

    private String locationId;       // optional
    private String businessAreaId;   // optional

    public String getFactoryName() { return factoryName; }
    public void setFactoryName(String factoryName) { this.factoryName = factoryName; }

    public String getStateId() { return stateId; }
    public void setStateId(String stateId) { this.stateId = stateId; }

    public String getDistrictId() { return districtId; }
    public void setDistrictId(String districtId) { this.districtId = districtId; }

    public String getBlockId() { return blockId; }
    public void setBlockId(String blockId) { this.blockId = blockId; }

    public String getLocationId() { return locationId; }
    public void setLocationId(String locationId) { this.locationId = locationId; }

    public String getBusinessAreaId() { return businessAreaId; }
    public void setBusinessAreaId(String businessAreaId) { this.businessAreaId = businessAreaId; }
}