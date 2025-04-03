package com.spring.security.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {

    @GetMapping("/")
    public String greet(HttpServletRequest request) {
        return "Welcome to Telusko "+request.getSession().getId();
    }

}
