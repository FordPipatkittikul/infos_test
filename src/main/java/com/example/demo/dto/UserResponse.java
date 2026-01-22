package com.example.demo.dto;

import com.example.demo.model.User;

import java.util.List;

public class UserResponse {

    private List<User> users;
    private String message;

    public UserResponse(List<User> users, String message) {
        this.users = users;
        this.message = message;
    }

    public List<User> getUsers() {
        return users;
    }

    public String getMessage() {
        return message;
    }
}

