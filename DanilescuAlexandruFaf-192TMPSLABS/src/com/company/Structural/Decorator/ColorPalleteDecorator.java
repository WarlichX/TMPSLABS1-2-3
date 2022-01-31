package com.company.Structural.Decorator;

public class ColorPalleteDecorator extends CostumeDecorator {

    public ColorPalleteDecorator(Costume specialCostume) {
        super(specialCostume);
    }

    public String chooseCostume() {
        return specialCostume.chooseCostume() + changeColorPallete();
    }

    private String changeColorPallete() {
        return " with different Color Pallete";
    }
}
