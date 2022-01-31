package com.company.BehavioralTemplate;

public abstract class MoveListTemplate {

    public abstract void doLowKick();
    public abstract void doHighKick();
    public abstract void doLowPunch();
    public abstract void doHighPunch();

    public final void performSpecialMove() {
        System.out.println("SPECIAL MOVE!");
    }

    public final void performCombo1() {
        doLowPunch();
        doHighPunch();
        doLowKick();
        doHighKick();
        performSpecialMove();
    };

}

