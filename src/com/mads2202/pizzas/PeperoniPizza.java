package com.mads2202.pizzas;

public class PeperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing pizza peperoni");
    }

    @Override
    public void bake() {
        System.out.println("Baking pizza peperoni");
    }

    @Override
    public void cut() {
        System.out.println("cutting pizza peperoni");
    }

    @Override
    public void box() {
        System.out.println("Boxing pizza peperoni");
    }
}