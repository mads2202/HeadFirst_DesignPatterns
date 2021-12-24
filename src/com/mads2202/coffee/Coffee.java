package com.mads2202.coffee;

public abstract class Coffee {
    protected String description = "No description";

    abstract public double cost();

    public String getDescription() {
        return description;
    }
}