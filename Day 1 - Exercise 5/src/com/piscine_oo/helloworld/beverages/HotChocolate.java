package com.piscine_oo.helloworld.beverages;

public class HotChocolate implements Beverage {
    private static final String DESCRIPTION = "Hot Chocolate";
    private static final double BASE_PRICE = 1.45;

    @Override
    public double getBasePrice() {
        return BASE_PRICE;
    }
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
