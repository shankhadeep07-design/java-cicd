// src/main/java/com/example/demo/dto/DomainResponse.java
package com.example.demo.dto;

import java.time.LocalDateTime;

public class DomainResponse {

    private String domainId;
    private String domainName;
    private Boolean isActive;
    private String createdBy;
    private String updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
    private String slug;

    public DomainResponse(String domainId, String domainName, Boolean isActive, String createdBy,
                          String updatedBy, LocalDateTime createdAt, LocalDateTime updatedAt,
                          LocalDateTime deletedAt, String slug) {
        this.domainId = domainId;
        this.domainName = domainName;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.slug = slug;
    }

    // Getters

    public String getDomainId() { return domainId; }
    public String getDomainName() { return domainName; }
    public Boolean getIsActive() { return isActive; }
    public String getCreatedBy() { return createdBy; }
    public String getUpdatedBy() { return updatedBy; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public LocalDateTime getDeletedAt() { return deletedAt; }
    public String getSlug() { return slug; }
}