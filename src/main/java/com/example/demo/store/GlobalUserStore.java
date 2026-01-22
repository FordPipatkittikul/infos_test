package com.example.demo.store;

import com.example.demo.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GlobalUserStore {

    public final List<User> users = new ArrayList<>();
}

