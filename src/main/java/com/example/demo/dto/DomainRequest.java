package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class DomainRequest {

    @NotBlank(message = "Domain name is required")
    private String domainName;

    public String getDomainName() { return domainName; }
    public void setDomainName(String domainName) { this.domainName = domainName; }
}