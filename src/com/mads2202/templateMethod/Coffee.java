package com.mads2202.templateMethod;

public class Coffee extends Beverage {
    @Override
    protected void putCondiments() {
        System.out.println("Put coffee");
    }

    @Override
    protected void putToppings() {
        System.out.println("Put sugar and milk");
    }
}