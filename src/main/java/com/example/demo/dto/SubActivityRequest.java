package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class SubActivityRequest {

    @NotBlank(message = "Sub activity name is required")
    private String subActivityName;

    @NotBlank(message = "Activity id is required")
    private String activityId;

    private String focusAreaId; // optional

    public String getSubActivityName() { return subActivityName; }
    public void setSubActivityName(String subActivityName) { this.subActivityName = subActivityName; }

    public String getActivityId() { return activityId; }
    public void setActivityId(String activityId) { this.activityId = activityId; }

    public String getFocusAreaId() { return focusAreaId; }
    public void setFocusAreaId(String focusAreaId) { this.focusAreaId = focusAreaId; }
}