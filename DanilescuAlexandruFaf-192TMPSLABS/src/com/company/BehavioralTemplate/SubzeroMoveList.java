package com.company.BehavioralTemplate;

public class SubzeroMoveList extends MoveListTemplate {
    @Override
    public void doLowKick() {
        System.out.println("Subzero low kick");
    }

    @Override
    public void doHighKick() {
        System.out.println("Subzero high kick");

    }

    @Override
    public void doLowPunch() {
        System.out.println("Subzero low kick");

    }

    @Override
    public void doHighPunch() {
        System.out.println("Subzero high kick");

    }
}
