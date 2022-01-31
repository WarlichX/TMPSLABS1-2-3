package com.company.Creational;

public abstract class FighterAbstractFactory {
    String fighterName = new String();

    public abstract Fighter getFighter(String fighterName) ;
    abstract void setFighter(String fighterName) ;
}
