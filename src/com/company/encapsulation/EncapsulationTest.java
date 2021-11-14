package com.company.encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {
        User user = new User("danny", "danny");
        String loginText = "Welcome, " + user.getUsername();
        System.out.println(user.login("danny") ? loginText : "incorrect password");
    }
}
