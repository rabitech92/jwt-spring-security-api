package com.spring.security.controller;

import com.spring.security.model.Users;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersController {

    @GetMapping("/users")
    public String getAllUsers() {
        return "Hello, World!";
    }

    public String get(HttpServletRequest request){
        String userId = request.getHeader("userId") + request.getSession();
        return "Hello, User with ID: " + userId;
    }

    private List<Users> students = new ArrayList<>(
            List.of(
                    new Users(1, "Navin", 60),
                    new Users(2, "Kiran", 65)
            ));

    @GetMapping("/students")
    public List<Users> getStudents() {
        return students;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");


    }


    @PostMapping("/students")
    public Users addStudent(@RequestBody Users student) {
        students.add(student);
        return student;
    }


}
