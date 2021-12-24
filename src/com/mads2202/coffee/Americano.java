package com.mads2202.coffee;

public class Americano extends Coffee {
    public Americano(){
        description="Americano";
    }
    @Override
    public double cost() {
        return 100d;
    }
}
