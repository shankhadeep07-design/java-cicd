package com.example.demo.dto;

import java.time.OffsetDateTime;

public class NationalIndicatorResponse {

    private String id;
    private String sdgId;
    private String target;
    private String indicator;
    private Boolean isActive;
    private String createdBy;
    private String updatedBy;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private OffsetDateTime deletedAt;

    public NationalIndicatorResponse(
            String id,
            String sdgId,
            String target,
            String indicator,
            Boolean isActive,
            String createdBy,
            String updatedBy,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            OffsetDateTime deletedAt) {

        this.id = id;
        this.sdgId = sdgId;
        this.target = target;
        this.indicator = indicator;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public String getId() {
        return id;
    }

    public String getSdgId() {
        return sdgId;
    }

    public String getTarget() {
        return target;
    }

    public String getIndicator() {
        return indicator;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public OffsetDateTime getDeletedAt() {
        return deletedAt;
    }
}