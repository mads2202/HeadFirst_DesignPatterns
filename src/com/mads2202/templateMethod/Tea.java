package com.mads2202.templateMethod;

public class Tea extends Beverage {
    @Override
    protected void putCondiments() {
        System.out.println("Put tea");
    }

    @Override
    protected void putToppings() {
        System.out.println("Put sugar and lemon");
    }
}
