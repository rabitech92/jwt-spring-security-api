package com.custom.configure;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class User {
    private int id;
    private String username;
    private int password;

    public User(int id, String username, int password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
