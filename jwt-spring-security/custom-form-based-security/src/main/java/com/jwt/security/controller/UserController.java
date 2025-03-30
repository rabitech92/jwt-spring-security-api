package com.jwt.security.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

    @GetMapping("/getAll")
    public String get(Authentication authentication){
        return "Hello form based security  "+authentication.getName();
    }

    @GetMapping("/login")
    public String getHomePage(){
        return "login";
    }

    @GetMapping("/welcome")
    public String getWelcome(){
        return "welcome";
    }
}
