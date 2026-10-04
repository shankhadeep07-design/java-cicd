package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class NationalIndicatorRequest {

    @NotBlank(message = "SDG id is required")
    private String sdgId;

    @Size(max = 255, message = "Target must be at most 255 characters")
    private String target; // optional

    @NotBlank(message = "Indicator is required")
    @Size(max = 255, message = "Indicator must be at most 255 characters")
    private String indicator;

    public String getSdgId() { return sdgId; }
    public void setSdgId(String sdgId) { this.sdgId = sdgId; }

    public String getTarget() { return target; }
    public void setTarget(String target) { this.target = target; }

    public String getIndicator() { return indicator; }
    public void setIndicator(String indicator) { this.indicator = indicator; }
}