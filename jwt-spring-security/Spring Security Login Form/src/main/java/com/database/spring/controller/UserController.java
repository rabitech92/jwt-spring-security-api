package com.database.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/welcome")
    public String getWelcome() {
        return "welcome";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }
}
