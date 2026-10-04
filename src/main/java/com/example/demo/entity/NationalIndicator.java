package com.example.demo.entity;

import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "t_national_indicator_master")
public class NationalIndicator {

    @Id
    @Column(name = "tnif_id", length = 100, nullable = false)
    private String tnifId;

    @Column(name = "tnif_sdg_id", length = 255)
    private String tnifSdgId;

    @Column(name = "tnif_target", length = 255)
    private String tnifTarget;

    @Column(name = "tnif_indicator", length = 255)
    private String tnifIndicator;

    @Column(name = "tnif_is_active")
    private Boolean tnifIsActive = true;

    @Column(name = "tnif_created_by", length = 100)
    private String tnifCreatedBy;

    @Column(name = "tnif_updated_by", length = 100)
    private String tnifUpdatedBy;

    @Column(name = "tnif_created_at", nullable = false)
    private OffsetDateTime tnifCreatedAt;

    @Column(name = "tnif_updated_at", nullable = false)
    private OffsetDateTime tnifUpdatedAt;

    @Column(name = "tnif_deleted_at")
    private OffsetDateTime tnifDeletedAt;

    // Getters and Setters

    public String getTnifId() {
        return tnifId;
    }

    public void setTnifId(String tnifId) {
        this.tnifId = tnifId;
    }

    public String getTnifSdgId() {
        return tnifSdgId;
    }

    public void setTnifSdgId(String tnifSdgId) {
        this.tnifSdgId = tnifSdgId;
    }

    public String getTnifTarget() {
        return tnifTarget;
    }

    public void setTnifTarget(String tnifTarget) {
        this.tnifTarget = tnifTarget;
    }

    public String getTnifIndicator() {
        return tnifIndicator;
    }

    public void setTnifIndicator(String tnifIndicator) {
        this.tnifIndicator = tnifIndicator;
    }

    public Boolean getTnifIsActive() {
        return tnifIsActive;
    }

    public void setTnifIsActive(Boolean tnifIsActive) {
        this.tnifIsActive = tnifIsActive;
    }

    public String getTnifCreatedBy() {
        return tnifCreatedBy;
    }

    public void setTnifCreatedBy(String tnifCreatedBy) {
        this.tnifCreatedBy = tnifCreatedBy;
    }

    public String getTnifUpdatedBy() {
        return tnifUpdatedBy;
    }

    public void setTnifUpdatedBy(String tnifUpdatedBy) {
        this.tnifUpdatedBy = tnifUpdatedBy;
    }

    public OffsetDateTime getTnifCreatedAt() {
        return tnifCreatedAt;
    }

    public void setTnifCreatedAt(OffsetDateTime tnifCreatedAt) {
        this.tnifCreatedAt = tnifCreatedAt;
    }

    public OffsetDateTime getTnifUpdatedAt() {
        return tnifUpdatedAt;
    }

    public void setTnifUpdatedAt(OffsetDateTime tnifUpdatedAt) {
        this.tnifUpdatedAt = tnifUpdatedAt;
    }

    public OffsetDateTime getTnifDeletedAt() {
        return tnifDeletedAt;
    }

    public void setTnifDeletedAt(OffsetDateTime tnifDeletedAt) {
        this.tnifDeletedAt = tnifDeletedAt;
    }
}