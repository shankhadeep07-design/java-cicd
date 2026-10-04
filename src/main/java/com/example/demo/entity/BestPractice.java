package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_best_practice")
public class BestPractice {

    @Id
    @Column(name = "tbp_id", length = 100, nullable = false)
    private String tbpId;

    @Column(name = "tbp_project_id", length = 100)
    private String tbpProjectId;

    @Column(name = "tbp_theme_id", length = 100)
    private String tbpThemeId;

    @Column(name = "tbp_focus_area_id", length = 100)
    private String tbpFocusAreaId;

    @Column(name = "tbp_problem", columnDefinition = "text")
    private String tbpProblem;

    @Column(name = "tbp_solution", columnDefinition = "text")
    private String tbpSolution;

    @Column(name = "tbp_benefit", columnDefinition = "text")
    private String tbpBenefit;

    @Column(name = "tbp_is_active")
    private Boolean tbpIsActive = true;

    @Column(name = "tbp_created_by")
    private Long tbpCreatedBy = 0L;

    @Column(name = "tbp_updated_by")
    private Long tbpUpdatedBy = 0L;

    @Column(name = "tbp_created_at", nullable = false)
    private LocalDateTime tbpCreatedAt;

    @Column(name = "tbp_updated_at", nullable = false)
    private LocalDateTime tbpUpdatedAt;

    @Column(name = "tbp_deleted_at")
    private LocalDateTime tbpDeletedAt;

    public String getTbpId() {
        return tbpId;
    }

    public void setTbpId(String tbpId) {
        this.tbpId = tbpId;
    }

    public String getTbpProjectId() {
        return tbpProjectId;
    }

    public void setTbpProjectId(String tbpProjectId) {
        this.tbpProjectId = tbpProjectId;
    }

    public String getTbpThemeId() {
        return tbpThemeId;
    }

    public void setTbpThemeId(String tbpThemeId) {
        this.tbpThemeId = tbpThemeId;
    }

    public String getTbpFocusAreaId() {
        return tbpFocusAreaId;
    }

    public void setTbpFocusAreaId(String tbpFocusAreaId) {
        this.tbpFocusAreaId = tbpFocusAreaId;
    }

    public String getTbpProblem() {
        return tbpProblem;
    }

    public void setTbpProblem(String tbpProblem) {
        this.tbpProblem = tbpProblem;
    }

    public String getTbpSolution() {
        return tbpSolution;
    }

    public void setTbpSolution(String tbpSolution) {
        this.tbpSolution = tbpSolution;
    }

    public String getTbpBenefit() {
        return tbpBenefit;
    }

    public void setTbpBenefit(String tbpBenefit) {
        this.tbpBenefit = tbpBenefit;
    }

    public Boolean getTbpIsActive() {
        return tbpIsActive;
    }

    public void setTbpIsActive(Boolean tbpIsActive) {
        this.tbpIsActive = tbpIsActive;
    }

    public Long getTbpCreatedBy() {
        return tbpCreatedBy;
    }

    public void setTbpCreatedBy(Long tbpCreatedBy) {
        this.tbpCreatedBy = tbpCreatedBy;
    }

    public Long getTbpUpdatedBy() {
        return tbpUpdatedBy;
    }

    public void setTbpUpdatedBy(Long tbpUpdatedBy) {
        this.tbpUpdatedBy = tbpUpdatedBy;
    }

    public LocalDateTime getTbpCreatedAt() {
        return tbpCreatedAt;
    }

    public void setTbpCreatedAt(LocalDateTime tbpCreatedAt) {
        this.tbpCreatedAt = tbpCreatedAt;
    }

    public LocalDateTime getTbpUpdatedAt() {
        return tbpUpdatedAt;
    }

    public void setTbpUpdatedAt(LocalDateTime tbpUpdatedAt) {
        this.tbpUpdatedAt = tbpUpdatedAt;
    }

    public LocalDateTime getTbpDeletedAt() {
        return tbpDeletedAt;
    }

    public void setTbpDeletedAt(LocalDateTime tbpDeletedAt) {
        this.tbpDeletedAt = tbpDeletedAt;
    }
}