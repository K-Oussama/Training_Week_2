package com.piscine_oo.helloworld.beverages;

public class Coffee implements Beverage {
    private static final String DESCRIPTION = "Coffee";
    private static final double BASE_PRICE = 1.20;

    @Override
    public double getBasePrice() {
        return BASE_PRICE;
    }
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}