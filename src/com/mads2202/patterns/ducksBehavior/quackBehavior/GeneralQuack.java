package com.mads2202.patterns.ducksBehavior.quackBehavior;

public class GeneralQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!!!");
    }
}