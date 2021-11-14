package com.company.encapsulation;

public class User {
    private final String username;
    private String password;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean login(String enteredPassword) {
        if (this.password.equals(enteredPassword)) {
            return true;
        }
        return false;
    }
}
