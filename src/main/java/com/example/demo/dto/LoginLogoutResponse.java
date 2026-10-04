package com.example.demo.dto;

import java.time.LocalDateTime;

public class LoginLogoutResponse {

    private Integer id;
    private Long userId;
    private String logType;
    private String ipAddress;
    private String userAgent;
    private String flArchive;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;

    public LoginLogoutResponse(
            Integer id,
            Long userId,
            String logType,
            String ipAddress,
            String userAgent,
            String flArchive,
            String status,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            String createdBy,
            String updatedBy) {

        this.id = id;
        this.userId = userId;
        this.logType = logType;
        this.ipAddress = ipAddress;
        this.userAgent = userAgent;
        this.flArchive = flArchive;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    public Integer getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public String getLogType() {
        return logType;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public String getFlArchive() {
        return flArchive;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }
}