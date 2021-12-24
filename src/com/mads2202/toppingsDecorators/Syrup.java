package com.mads2202.toppingsDecorators;

import com.mads2202.coffee.Coffee;

public class Syrup extends BaseDecorator {
    public static final double SYRUP_COST = 75d;
    public static final String SYRUP_DESCRIPTION = "Syrop";

    public Syrup(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + SYRUP_COST;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + " + SYRUP_DESCRIPTION;
    }
}