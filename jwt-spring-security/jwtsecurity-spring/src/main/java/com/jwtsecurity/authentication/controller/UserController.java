package com.jwtsecurity.authentication.controller;


import com.jwtsecurity.authentication.entity.User;
import com.jwtsecurity.authentication.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    private List<User> userList = new ArrayList<>();

    public UserController() {
        userList.add(new User(UUID.randomUUID().toString(), "sinha", "hrishab@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(), "farha", "ritesh@gmail.com"));
    }


    @GetMapping("/get")
    public String get (){
        return "Hello java";
    }
    @GetMapping("/users")
    public List<User> getUser(){
        return userList;
    }
}
