// src/main/java/com/example/demo/service/UserService.java
package com.example.demo.service;

import com.example.demo.entity.User;
import java.util.List;
import com.example.demo.dto.UserResponse;

public interface UserService {
    List<UserResponse> getAllUsers();
    User getUserById(Long id);        // <-- new method

    User createUser(User user);

}