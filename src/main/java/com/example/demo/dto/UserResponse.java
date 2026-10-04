package com.example.demo.dto;

public class UserResponse {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String roleId;

    public UserResponse(Long id, String name, String email, String phone, String roleId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.roleId = roleId;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getRoleId() { return roleId; }
}