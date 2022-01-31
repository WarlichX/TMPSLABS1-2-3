package com.company.Structural.Adapter;

public class DCVsMortalKombatAdapter extends MKCharacter {
    private DCCharacter character;

    public DCVsMortalKombatAdapter(DCCharacter character) {
        this.character = character;
    }

    @Override
    public double getPower() {
        double result;
        result = character.getForce();
        return result;
    }
}
