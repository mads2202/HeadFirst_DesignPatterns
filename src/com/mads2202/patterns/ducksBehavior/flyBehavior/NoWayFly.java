package com.mads2202.patterns.ducksBehavior.flyBehavior;

public class NoWayFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Could not fly");
    }
}