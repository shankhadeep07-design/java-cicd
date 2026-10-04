package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class ThemeRequest {

    @NotBlank(message = "Theme name is required")
    private String themeName;

    private String domainId; // optional, e.g. "tdn0000000003"

    public String getThemeName() { return themeName; }
    public void setThemeName(String themeName) { this.themeName = themeName; }

    public String getDomainId() { return domainId; }
    public void setDomainId(String domainId) { this.domainId = domainId; }
}