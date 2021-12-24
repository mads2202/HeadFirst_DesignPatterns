package com.mads2202.pizzas;

public class RealItalianMargaritaPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing italian pizza margarita");
    }

    @Override
    public void bake() {
        System.out.println("Baking italian pizza margarita");
    }

    @Override
    public void cut() {
        System.out.println("Cutting italian pizza margarita");
    }

    @Override
    public void box() {
        System.out.println("Boxing italian pizza margarita");
    }
}