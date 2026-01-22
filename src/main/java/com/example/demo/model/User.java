package com.example.demo.model;

public class User {

    private String username;
    private int age;
    private String phone;

    public User() {}

    public User(String username, int age, String phone) {
        this.username = username;
        this.age = age;
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

