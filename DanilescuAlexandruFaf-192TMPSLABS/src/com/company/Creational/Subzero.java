package com.company.Creational;

import com.company.Structural.Bridge.CharacterController;

public class Subzero implements Fighter {

    @Override
    public void select() {
        System.out.println("Subzero was selected");
    }

    public void costume(String type) {
        if(type.equalsIgnoreCase("A")) {
            System.out.println("Subzero: Costume A was selected");

        } else if(type.equalsIgnoreCase("B")) {
            System.out.println("Subzero: Costume B was selected");

        } else {
            System.out.println("Subzero: Default Costume was selected");
        }
    }
}