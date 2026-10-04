// src/main/java/com/example/demo/dto/MasterResponse.java
package com.example.demo.dto;

public class MasterResponse {
    private String id;
    private String name;

    public MasterResponse(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
}