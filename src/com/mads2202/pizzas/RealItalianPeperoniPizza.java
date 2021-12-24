package com.mads2202.pizzas;

public class RealItalianPeperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing italian pizza peperoni");
    }

    @Override
    public void bake() {
        System.out.println("Baking italian pizza peperoni");
    }

    @Override
    public void cut() {
        System.out.println("cutting italian pizza peperoni");
    }

    @Override
    public void box() {
        System.out.println("Boxing italian pizza peperoni");
    }
}