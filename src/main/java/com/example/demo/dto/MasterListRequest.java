package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class MasterListRequest {

    @NotBlank(message = "Master list name is required")
    private String masterListName;

    private String masterListDesc; // optional

    public String getMasterListName() { return masterListName; }
    public void setMasterListName(String masterListName) { this.masterListName = masterListName; }

    public String getMasterListDesc() { return masterListDesc; }
    public void setMasterListDesc(String masterListDesc) { this.masterListDesc = masterListDesc; }
}