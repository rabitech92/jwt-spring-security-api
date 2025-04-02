package com.custom.login.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String greet(HttpServletRequest request) {
        return "Welcome to Rabiul "+request.getSession().getId();
    }

    @GetMapping("/get")
    public String get (){
        return "Hello Rabiul";
    }

}
