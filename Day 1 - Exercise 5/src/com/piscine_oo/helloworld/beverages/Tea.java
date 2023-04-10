package com.piscine_oo.helloworld.beverages;

public class Tea implements Beverage {
    private static final String DESCRIPTION = "Tea";
    private static final double BASE_PRICE = 1.50;

    @Override
    public double getBasePrice() {
        return BASE_PRICE;
    }
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

}
