package com.company.composition;

public class Monitor {
    private String screen;

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public void turnOn() {
        System.out.println("Monitor On!");
    }
}
