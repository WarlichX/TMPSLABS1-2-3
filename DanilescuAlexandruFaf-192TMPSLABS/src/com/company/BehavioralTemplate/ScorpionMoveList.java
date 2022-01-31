package com.company.BehavioralTemplate;

public class ScorpionMoveList extends MoveListTemplate {
    @Override
    public void doLowKick() {
        System.out.println("Scorpion low kick");
    }

    @Override
    public void doHighKick() {
        System.out.println("Scorpion high kick");

    }

    @Override
    public void doLowPunch() {
        System.out.println("Scorpion low kick");

    }

    @Override
    public void doHighPunch() {
        System.out.println("Scorpion high kick");

    }
}
