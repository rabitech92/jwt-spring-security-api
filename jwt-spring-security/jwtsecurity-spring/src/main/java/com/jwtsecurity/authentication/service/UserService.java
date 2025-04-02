package com.jwtsecurity.authentication.service;

import com.jwtsecurity.authentication.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> userList = new ArrayList<>();

    public UserService() {
        userList.add(new User(UUID.randomUUID().toString(), "sinha", "hrishab@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(), "farha", "ritesh@gmail.com"));
    }

    public List<User> getUserList() {
        return userList;
    }
}
