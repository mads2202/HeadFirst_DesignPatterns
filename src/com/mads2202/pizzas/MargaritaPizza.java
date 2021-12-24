package com.mads2202.pizzas;

public class MargaritaPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing pizza margarita");
    }

    @Override
    public void bake() {
        System.out.println("Baking pizza margarita");
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza margarita");
    }

    @Override
    public void box() {
        System.out.println("Boxing pizza margarita");
    }
}