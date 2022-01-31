package com.company.Creational;

public class FighterFactory extends FighterAbstractFactory {

    //use getShape method to get object of type Fighter
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

    public void setFighter(String fighterName) {

    }
}
