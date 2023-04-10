package com.piscine_oo.helloworld.beverages;


public class BeverageWithCream implements Supplement {
    private static final String DESCRIPTION = "Cream";
    private static final double SUPPLEMENT_PRICE = 0.15;

    private Beverage beverage;

    public BeverageWithCream(Beverage beverage) {
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
        return beverage.getDescription() + " with Cream";
    }

    @Override
    public String getSupplementDescription() {
        return DESCRIPTION;
    }
}
