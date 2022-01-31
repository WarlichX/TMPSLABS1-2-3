package com.company.Structural.Decorator;

public class CostumeDecorator implements Costume {
    protected Costume specialCostume;

    public CostumeDecorator(Costume specialCostume) {
        this.specialCostume = specialCostume;
    }

    @Override
    public String chooseCostume() {
        return specialCostume.chooseCostume();
    }
}
