package com.lowleveldesign.enums;

public enum Coins {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25),
    HALF_DOLLAR(50),
    DOLLAR(100);

    private final int valueInCents;

    Coins(int valueInCents) {
        this.valueInCents = valueInCents;
    }

    public int getValue() {
        return valueInCents;
    }
}
