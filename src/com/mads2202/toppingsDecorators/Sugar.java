package com.mads2202.toppingsDecorators;

import com.mads2202.coffee.Coffee;

public class Sugar extends BaseDecorator {
    private static final double SUGAR_COST = 10d;
    private static final String SUGAR_DESCRIPTION = "Sugar";

    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + SUGAR_COST;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + " + SUGAR_DESCRIPTION;
    }
}