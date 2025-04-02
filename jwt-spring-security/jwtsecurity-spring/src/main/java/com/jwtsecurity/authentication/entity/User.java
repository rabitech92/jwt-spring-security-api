package com.jwtsecurity.authentication.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
public class User {

    private String id;
    private String name;
    private String email;

    public User(String id, String name, String email) {
    }
}
