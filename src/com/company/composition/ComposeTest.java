package com.company.composition;

public class ComposeTest {
    public static void main(String[] args) {
        Computer computer = new Computer(new Monitor(), new Keyboard(new Key("K")));

        computer.switchComputerOn();
        computer.pushLetter();
    }
}
