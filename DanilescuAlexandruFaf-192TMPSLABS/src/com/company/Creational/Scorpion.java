package com.company.Creational;

import com.company.Structural.Bridge.CharacterController;
import com.company.Structural.Bridge.ScorpionController;

public class Scorpion implements Fighter {

    @Override
    public void select() {
        System.out.println("Scorpion was selected");
    }

    public void costume(String type) {
        if (type.equalsIgnoreCase("A")) {
            System.out.println("Scorpion: Costume A was selected");

        } else if (type.equalsIgnoreCase("B")) {
            System.out.println("Scorpion: Costume B was selected");

        } else {
            System.out.println("Scorpion: Default Costume was selected");
        }
    }
}