package com.company.Creational;

public class FighterFactoryProducer {
    public static FighterAbstractFactory getPlayerFactory(int playerIndex){
        if (playerIndex == 1) {
            return new Player1Factory();

        } else if (playerIndex == 2) {
            return new Player2Factory();

        } else {
            return null;
        }
    }
}
