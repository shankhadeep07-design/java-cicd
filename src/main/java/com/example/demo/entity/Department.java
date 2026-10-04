package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "t_department")
public class Department {

    @Id
    @Column(name = "td_id", length = 100, nullable = false)
    private String tdId;

    @Column(name = "td_department_name")
    private String tdDepartmentName;

    @Column(name = "td_department_slug")
    private String tdDepartmentSlug;

    @Column(name = "td_status")
    private Boolean tdStatus = true;

    @Column(name = "td_created_by")
    private Long tdCreatedBy;

    @Column(name = "td_updated_by")
    private Long tdUpdatedBy;

    @Column(name = "td_created_at", nullable = false)
    private LocalDateTime tdCreatedAt;

    @Column(name = "td_updated_at", nullable = false)
    private LocalDateTime tdUpdatedAt;

    @Column(name = "td_deleted_at")
    private LocalTime tdDeletedAt;

    public String getTdId() { return tdId; }
    public void setTdId(String tdId) { this.tdId = tdId; }

    public String getTdDepartmentName() { return tdDepartmentName; }
    public void setTdDepartmentName(String tdDepartmentName) { this.tdDepartmentName = tdDepartmentName; }

    public String getTdDepartmentSlug() { return tdDepartmentSlug; }
    public void setTdDepartmentSlug(String tdDepartmentSlug) { this.tdDepartmentSlug = tdDepartmentSlug; }

    public Boolean getTdStatus() { return tdStatus; }
    public void setTdStatus(Boolean tdStatus) { this.tdStatus = tdStatus; }

    public Long getTdCreatedBy() { return tdCreatedBy; }
    public void setTdCreatedBy(Long tdCreatedBy) { this.tdCreatedBy = tdCreatedBy; }

    public Long getTdUpdatedBy() { return tdUpdatedBy; }
    public void setTdUpdatedBy(Long tdUpdatedBy) { this.tdUpdatedBy = tdUpdatedBy; }

    public LocalDateTime getTdCreatedAt() { return tdCreatedAt; }
    public void setTdCreatedAt(LocalDateTime tdCreatedAt) { this.tdCreatedAt = tdCreatedAt; }

    public LocalDateTime getTdUpdatedAt() { return tdUpdatedAt; }
    public void setTdUpdatedAt(LocalDateTime tdUpdatedAt) { this.tdUpdatedAt = tdUpdatedAt; }

    public LocalTime getTdDeletedAt() { return tdDeletedAt; }
    public void setTdDeletedAt(LocalTime tdDeletedAt) { this.tdDeletedAt = tdDeletedAt; }
}