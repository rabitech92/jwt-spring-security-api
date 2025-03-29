package com.spring.security.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping
    public String get(Authentication authentication){
        return "Hello in memory security  " +authentication.getName();
    }
}
