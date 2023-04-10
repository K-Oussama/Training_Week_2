package com.piscine_oo.helloworld.beverages;


public class BeverageWithMilk implements Supplement {
    private static final String DESCRIPTION = "Milk";
    private static final double SUPPLEMENT_PRICE = 0.10;

    private Beverage beverage;

    public BeverageWithMilk(Beverage beverage) {
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
        return beverage.getDescription() + " with Milk";
    }

    @Override
    public String getSupplementDescription() {
        return DESCRIPTION;
    }
}

