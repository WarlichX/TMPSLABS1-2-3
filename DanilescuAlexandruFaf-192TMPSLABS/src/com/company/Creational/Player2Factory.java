package com.company.Creational;

public class Player2Factory extends FighterAbstractFactory {

    @Override
    public Fighter getFighter(String fighterName){
        if(fighterName == null){
            return null;
        }
        if(fighterName.equalsIgnoreCase("Subzero")){
            return new Subzero();

        } else if(fighterName.equalsIgnoreCase("Scorpion")){
            return new Scorpion();
        }

        return null;
    }

    @Override
    void setFighter(String fighterName) {

    }
}
