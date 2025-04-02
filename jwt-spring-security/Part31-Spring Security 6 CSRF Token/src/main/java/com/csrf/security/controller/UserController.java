package com.csrf.security.controller;

import com.csrf.security.model.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    private List<User> userList = new ArrayList<>(List.of(
            new User(10,"Rabiul",60),
            new User(11,"sinha",60)));

    @GetMapping("/students")
    public List<User> getStudents() {
        return userList;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");


    }

    @PostMapping("/students")
    public User addStudent(@RequestBody User user) {
        userList.add(user);
        return user;
    }
}
