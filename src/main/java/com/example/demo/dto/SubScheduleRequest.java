package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class SubScheduleRequest {

    @NotBlank(message = "Sub schedule name is required")
    private String subScheduleName;

    @NotBlank(message = "Schedule id is required")
    private String scheduleId;

    public String getSubScheduleName() { return subScheduleName; }
    public void setSubScheduleName(String subScheduleName) { this.subScheduleName = subScheduleName; }

    public String getScheduleId() { return scheduleId; }
    public void setScheduleId(String scheduleId) { this.scheduleId = scheduleId; }
}