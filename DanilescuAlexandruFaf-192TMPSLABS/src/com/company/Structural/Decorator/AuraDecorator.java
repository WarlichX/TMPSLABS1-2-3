package com.company.Structural.Decorator;

public class AuraDecorator extends CostumeDecorator {

    public AuraDecorator(Costume specialCostume) {
        super(specialCostume);
    }

    public String chooseCostume() {
        return specialCostume.chooseCostume() + addAura();
    }

    private String addAura() {
        return " and Aura";
    }
}
