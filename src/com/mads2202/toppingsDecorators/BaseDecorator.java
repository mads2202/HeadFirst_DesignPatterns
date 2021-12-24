package com.mads2202.toppingsDecorators;

import com.mads2202.coffee.Coffee;

public abstract class BaseDecorator extends Coffee {
    protected Coffee coffee;

    public BaseDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public abstract double cost();

    public abstract String getDescription();
}