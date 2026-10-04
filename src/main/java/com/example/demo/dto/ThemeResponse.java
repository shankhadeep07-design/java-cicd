// src/main/java/com/example/demo/dto/response/ThemeResponse.java
package com.example.demo.dto.response;

import java.time.OffsetDateTime;

public class ThemeResponse {

    private String themeId;
    private String themeName;
    private Boolean isActive;
    private String createdBy;
    private String updatedBy;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private OffsetDateTime deletedAt;
    private String domainId;

    public ThemeResponse(String themeId, String themeName, Boolean isActive, String createdBy,
                         String updatedBy, OffsetDateTime createdAt, OffsetDateTime updatedAt,
                         OffsetDateTime deletedAt, String domainId) {
        this.themeId = themeId;
        this.themeName = themeName;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.domainId = domainId;
    }

    // Getters

    public String getThemeId() { return themeId; }
    public String getThemeName() { return themeName; }
    public Boolean getIsActive() { return isActive; }
    public String getCreatedBy() { return createdBy; }
    public String getUpdatedBy() { return updatedBy; }
    public OffsetDateTime getCreatedAt() { return createdAt; }
    public OffsetDateTime getUpdatedAt() { return updatedAt; }
    public OffsetDateTime getDeletedAt() { return deletedAt; }
    public String getDomainId() { return domainId; }
}