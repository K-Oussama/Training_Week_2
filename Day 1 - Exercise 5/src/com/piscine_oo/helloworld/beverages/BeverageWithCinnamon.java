package com.piscine_oo.helloworld.beverages;

public class BeverageWithCinnamon implements Supplement {
    private static final String DESCRIPTION = "Cinnamon";
    private static final double SUPPLEMENT_PRICE = 0.05;

    private Beverage beverage;

    public BeverageWithCinnamon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getBasePrice() {
        return beverage.getBasePrice();
    }

    @Override
    public double getSupplementPrice() {
        return SUPPLEMENT_PRICE;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Cinnamon";
    }

    @Override
    public String getSupplementDescription() {
        return DESCRIPTION;
    }
}

