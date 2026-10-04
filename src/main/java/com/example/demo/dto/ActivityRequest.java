package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class ActivityRequest {

    @NotBlank(message = "Activity name is required")
    private String activityName;

    @NotBlank(message = "Schedule id is required")
    private String scheduleId;

    private String focusAreaId; // optional

    public String getActivityName() { return activityName; }
    public void setActivityName(String activityName) { this.activityName = activityName; }

    public String getScheduleId() { return scheduleId; }
    public void setScheduleId(String scheduleId) { this.scheduleId = scheduleId; }

    public String getFocusAreaId() { return focusAreaId; }
    public void setFocusAreaId(String focusAreaId) { this.focusAreaId = focusAreaId; }
}