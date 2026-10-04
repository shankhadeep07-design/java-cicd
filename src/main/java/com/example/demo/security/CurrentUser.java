package com.example.demo.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class CurrentUser {

    public static Long getId() {

        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        return (Long) authentication.getPrincipal();
    }
}