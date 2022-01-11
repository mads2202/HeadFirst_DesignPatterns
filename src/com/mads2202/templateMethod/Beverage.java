package com.mads2202.templateMethod;

public abstract class Beverage {
    public void prepare() {
        putCondiments();
        pourWater();
        putToppings();
    }

    protected void pourWater() {
        System.out.println("Pour water in the cup");
    }

    abstract protected void putCondiments();

    abstract protected void putToppings();
}