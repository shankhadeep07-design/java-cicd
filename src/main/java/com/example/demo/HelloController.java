package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import lombok.Builder;
import lombok.Data;
@RestController
public class HelloController {

    @Autowired
    private UserService userService;   // <-- now depends on Service, not Repository

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    private static final Logger logger =
            LoggerFactory.getLogger(HelloController.class);




    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }



    int retryCount=1;

    @GetMapping("/users/{id}")
    //@CircuitBreaker(name="ratingHotelBreaker",fallbackMethod = "ratingHotelFallBckmethod")
    //@Retry(name="ratingHotelBreaker",fallbackMethod = "ratingHotelFallBckmethod")
    @RateLimiter(name="userRateLimiter",fallbackMethod = "ratingHotelFallBckmethod")
    public User getSingleUser(@PathVariable Long id) {
        logger.info("retryCount: {}", retryCount);
        retryCount++;
        return userService.getUserById(id);
    }

    public User ratingHotelFallBckmethod(Long id, Throwable ex) {

        System.out.println("Rating service is down: " + ex.getMessage());

        User user = new User();

        user.setId(id);
        user.setName("Dummy User");
        user.setEmail("dummy@gmail.com");
        user.setGallery(Collections.emptyList());

        return user;
    }



}