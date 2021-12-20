package com.mads2202.patterns.ducks;

import com.mads2202.patterns.ducksBehavior.flyBehavior.FlyBehavior;
import com.mads2202.patterns.ducksBehavior.quackBehavior.QuackBehavior;

public class MallardDuck extends Duck {
    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }
}