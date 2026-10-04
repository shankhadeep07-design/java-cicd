package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class ScheduleSevenRequest {

    @NotBlank(message = "Schedule name is required")
    private String scheduleName;

    private String scheduleViiLineItem;        // optional
    private String subActivityItemNumber;      // optional
    private String subActivityDescription;     // optional

    public String getScheduleName() { return scheduleName; }
    public void setScheduleName(String scheduleName) { this.scheduleName = scheduleName; }

    public String getScheduleViiLineItem() { return scheduleViiLineItem; }
    public void setScheduleViiLineItem(String v) { this.scheduleViiLineItem = v; }

    public String getSubActivityItemNumber() { return subActivityItemNumber; }
    public void setSubActivityItemNumber(String v) { this.subActivityItemNumber = v; }

    public String getSubActivityDescription() { return subActivityDescription; }
    public void setSubActivityDescription(String v) { this.subActivityDescription = v; }
}