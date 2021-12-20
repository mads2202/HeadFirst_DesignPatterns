package com.mads2202.patterns.ducksBehavior.quackBehavior;

public class NoQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("...");
    }
}