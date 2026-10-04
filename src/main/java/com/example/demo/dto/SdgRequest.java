package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class SdgRequest {

    @NotBlank(message = "SDG name is required")
    private String name;

    private String desc; // optional

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDesc() { return desc; }
    public void setDesc(String desc) { this.desc = desc; }
}