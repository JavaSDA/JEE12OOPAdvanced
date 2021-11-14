package com.company.composition;

public class Computer {
    private Monitor monitor;
    private Keyboard keyboard;

    public Computer(Monitor monitor, Keyboard keyboard) {
        this.monitor = monitor;
        this.keyboard = keyboard;
    }


    public void switchComputerOn() {
        this.monitor.turnOn();
        System.out.println("Computer Functional");
    }

    public void pushLetter() {
        System.out.println(this.keyboard.getKey().getLetter());
    }

}
