package com.company.Structural.Bridge;

import com.company.Structural.Bridge.CharacterController;

public class Player2 extends PlayerController {
    protected CharacterController characterController;

    public Player2(CharacterController characterController) {
        this.characterController = characterController;
    }

    @Override
    public void doCombo1() {
        characterController.performCombo1();
    }

    @Override
    public void doCombo2() {
        characterController.performCombo2();
    }

    @Override
    void doSpecialCombo() {
        characterController.performSpecialCombo();
    }
}
