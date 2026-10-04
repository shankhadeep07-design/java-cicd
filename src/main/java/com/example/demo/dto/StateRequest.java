package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class StateRequest {

    @NotBlank(message = "State name is required")
    private String stateName;

    public String getStateName() { return stateName; }
    public void setStateName(String stateName) { this.stateName = stateName; }
}