package com.company.Structural.Adapter;

public class MKUniverse {
    private double power;

    public MKUniverse(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public boolean compatible(MKCharacter character) {
        boolean result;
        result = (this.getPower() >= character.getPower());
        return result;
    }

}
