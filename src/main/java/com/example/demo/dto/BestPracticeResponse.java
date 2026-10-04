package com.example.demo.dto;

import java.time.LocalDateTime;

public class BestPracticeResponse {

    private String id;
    private String projectId;
    private String themeId;
    private String focusAreaId;
    private String problem;
    private String solution;
    private String benefit;
    private Boolean isActive;
    private Long createdBy;
    private Long updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    public BestPracticeResponse(
            String id,
            String projectId,
            String themeId,
            String focusAreaId,
            String problem,
            String solution,
            String benefit,
            Boolean isActive,
            Long createdBy,
            Long updatedBy,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            LocalDateTime deletedAt
    ) {
        this.id = id;
        this.projectId = projectId;
        this.themeId = themeId;
        this.focusAreaId = focusAreaId;
        this.problem = problem;
        this.solution = solution;
        this.benefit = benefit;
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

    public String getProjectId() {
        return projectId;
    }

    public String getThemeId() {
        return themeId;
    }

    public String getFocusAreaId() {
        return focusAreaId;
    }

    public String getProblem() {
        return problem;
    }

    public String getSolution() {
        return solution;
    }

    public String getBenefit() {
        return benefit;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }
}