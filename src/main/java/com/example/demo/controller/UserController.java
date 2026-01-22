package com.example.demo.controller;

import com.example.demo.dto.UserResponse;
import com.example.demo.model.User;
import com.example.demo.store.GlobalUserStore;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final GlobalUserStore store;

    public UserController(GlobalUserStore store) {
        this.store = store;
    }

    @GetMapping
    public List<User> getAll() {
        return store.users;
    }

    @PostMapping
    public UserResponse add(@RequestBody User user) {
        store.users.add(user);
        return new UserResponse(store.users, "successfully added");
    }
}


