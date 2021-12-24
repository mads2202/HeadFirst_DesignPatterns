package com.mads2202.toppingsDecorators;

import com.mads2202.coffee.Coffee;

public class Milk extends BaseDecorator {
    private static final double MILK_COST = 30d;
    private static final String MILK_DESCRIPTION = "Milk";

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + MILK_COST;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + " + MILK_DESCRIPTION;
    }
}
