package com.company.Structural.Bridge;

import com.company.Structural.Bridge.PlayerController;

public class ScorpionController implements CharacterController {
    @Override
    public void performCombo1() {
        System.out.println("Scorpion: AABBA");
    }

    @Override
    public void performCombo2() {
        System.out.println("Scorpion: BBABBA");
    }

    @Override
    public void performSpecialCombo() {
        System.out.println("Scorpion: ABC");
    }
}

