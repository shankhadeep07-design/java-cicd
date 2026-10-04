package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

public class ProjectRequest {

    @NotBlank(message = "Proposal id is required")
    private String proposalId;

    @PositiveOrZero(message = "Allocated budget cannot be negative")
    private Double allocateBudgetAmount; // optional, defaults to the proposal's project budget

    public String getProposalId() { return proposalId; }
    public void setProposalId(String proposalId) { this.proposalId = proposalId; }

    public Double getAllocateBudgetAmount() { return allocateBudgetAmount; }
    public void setAllocateBudgetAmount(Double v) { this.allocateBudgetAmount = v; }
}