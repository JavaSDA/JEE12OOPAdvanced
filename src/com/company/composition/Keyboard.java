package com.company.composition;

public class Keyboard {
    private Key key;

    public Keyboard(Key key) {
        this.key = key;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }
}
