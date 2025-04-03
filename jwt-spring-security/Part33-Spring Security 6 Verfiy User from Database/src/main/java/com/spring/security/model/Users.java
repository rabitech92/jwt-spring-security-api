package com.spring.security.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Users {

    @Id
    private int id;
    private String username;
    private String password;

    public Users(int i, String navin, int i1) {
    }

    public Users() {

    }
}
