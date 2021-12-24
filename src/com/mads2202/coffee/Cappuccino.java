package com.mads2202.coffee;

public class Cappuccino extends Coffee {
    public Cappuccino() {
        description="Cappuccino";
    }

    @Override
    public double cost() {
        return 150d;
    }
}
