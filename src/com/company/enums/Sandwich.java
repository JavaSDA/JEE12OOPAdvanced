package com.company.enums;

public enum Sandwich {

    PI(3.14);

    private final double value;
    // Enum constructors do not use access modifiers
    Sandwich(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
