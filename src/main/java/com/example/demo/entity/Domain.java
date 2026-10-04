// src/main/java/com/example/demo/entity/Domain.java
package com.example.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "t_domain_master")
public class Domain {

    @Id
    @Column(name = "tdn_domain_id", length = 100, nullable = false)
    private String tdnDomainId;

    @Column(name = "tdn_domain_name", length = 100)
    private String tdnDomainName;

    @Column(name = "tdn_is_active")
    private Boolean tdnIsActive = true;

    @Column(name = "tdn_created_by", length = 100)
    private String tdnCreatedBy;

    @Column(name = "tdn_updated_by", length = 100)
    private String tdnUpdatedBy;

    @Column(name = "tdn_created_at", nullable = false)
    private LocalDateTime tdnCreatedAt;

    @Column(name = "tdn_updated_at", nullable = false)
    private LocalDateTime tdnUpdatedAt;

    @Column(name = "tdn_deleted_at")
    private LocalDateTime tdnDeletedAt;

    @Column(name = "tdn_slug", length = 255)
    private String tdnSlug;

    // Getters and Setters

    public String getTdnDomainId() { return tdnDomainId; }
    public void setTdnDomainId(String tdnDomainId) { this.tdnDomainId = tdnDomainId; }

    public String getTdnDomainName() { return tdnDomainName; }
    public void setTdnDomainName(String tdnDomainName) { this.tdnDomainName = tdnDomainName; }

    public Boolean getTdnIsActive() { return tdnIsActive; }
    public void setTdnIsActive(Boolean tdnIsActive) { this.tdnIsActive = tdnIsActive; }

    public String getTdnCreatedBy() { return tdnCreatedBy; }
    public void setTdnCreatedBy(String tdnCreatedBy) { this.tdnCreatedBy = tdnCreatedBy; }

    public String getTdnUpdatedBy() { return tdnUpdatedBy; }
    public void setTdnUpdatedBy(String tdnUpdatedBy) { this.tdnUpdatedBy = tdnUpdatedBy; }

    public LocalDateTime getTdnCreatedAt() { return tdnCreatedAt; }
    public void setTdnCreatedAt(LocalDateTime tdnCreatedAt) { this.tdnCreatedAt = tdnCreatedAt; }

    public LocalDateTime getTdnUpdatedAt() { return tdnUpdatedAt; }
    public void setTdnUpdatedAt(LocalDateTime tdnUpdatedAt) { this.tdnUpdatedAt = tdnUpdatedAt; }

    public LocalDateTime getTdnDeletedAt() { return tdnDeletedAt; }
    public void setTdnDeletedAt(LocalDateTime tdnDeletedAt) { this.tdnDeletedAt = tdnDeletedAt; }

    public String getTdnSlug() { return tdnSlug; }
    public void setTdnSlug(String tdnSlug) { this.tdnSlug = tdnSlug; }
}