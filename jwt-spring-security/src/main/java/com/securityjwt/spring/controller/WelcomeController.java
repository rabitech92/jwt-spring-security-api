package com.securityjwt.spring.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {

    @GetMapping("/get")
    public String messages(Authentication authentication){
        return "Hello Http basic security  " +authentication.getName();
    }

}
