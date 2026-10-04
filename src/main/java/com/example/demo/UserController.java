package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.example.demo.dto.UserResponse;
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/all")
    public List<UserResponse> getAllUsers() {
        return userService.getAllUsers();
    }
}
