package com.company.Structural.Bridge;

import com.company.Structural.Bridge.PlayerController;

public class SubzeroController implements CharacterController {

    @Override
    public void performCombo1() {
        System.out.println("Subzero: ABBAAAB");
    }

    @Override
    public void performCombo2() {
        System.out.println("Subzero: BAAB");
    }

    @Override
    public void performSpecialCombo() {
        System.out.println("Subzero: AA ABC");
    }
}
