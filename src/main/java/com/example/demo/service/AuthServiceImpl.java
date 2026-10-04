package com.example.demo.service;

import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.LoginResponse;
import com.example.demo.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import com.example.demo.repository.UserRepository;

import com.example.demo.entity.User;


@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;



    @Autowired
    private UserRepository userRepository;   // <-- add this

    @Override
    public LoginResponse login(LoginRequest request) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            request.getUsername(),
                            request.getPassword()
                    )
            );

        // String token = jwtUtil.generateToken(authentication.getName());

            User user = userRepository.findByEmail(authentication.getName())
                    .orElseThrow(() -> new RuntimeException("User not found"));



            System.out.println("User ID: " + user.getId());
            System.out.println("User Name: " + user.getName());
            System.out.println("User Email: " + user.getEmail());
            System.out.println("User RoleId: " + user.getRoleId());


            String token = jwtUtil.generateToken(
                    user.getId(),
                    user.getName(),
                    user.getEmail(),
                    user.getRoleId()
            );
            return new LoginResponse(token, authentication.getName());

        } catch (BadCredentialsException ex) {
            throw new RuntimeException("Invalid username or password", ex);
        }
    }
}