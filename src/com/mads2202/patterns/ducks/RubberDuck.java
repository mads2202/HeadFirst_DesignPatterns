package com.mads2202.patterns.ducks;

import com.mads2202.patterns.ducksBehavior.flyBehavior.FlyBehavior;
import com.mads2202.patterns.ducksBehavior.quackBehavior.QuackBehavior;

public class RubberDuck extends Duck {
    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }
}