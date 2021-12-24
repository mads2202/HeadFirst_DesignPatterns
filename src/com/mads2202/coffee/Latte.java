package com.mads2202.coffee;

public class Latte extends Coffee {
    public Latte() {
        description = "Latte";
    }

    @Override
    public double cost() {
        return 200d;
    }
}