package com.jasiqlabs.controller;
import com.jasiqlabs.domain.User;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/users")
public class UserController {
    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        return "User registered: " + user.getName();
    }
}

