package com.mads2202.patterns;

import com.mads2202.patterns.ducks.Duck;
import com.mads2202.patterns.ducks.MallardDuck;
import com.mads2202.patterns.ducks.RedHeadDuck;
import com.mads2202.patterns.ducks.RubberDuck;
import com.mads2202.patterns.ducksBehavior.flyBehavior.FlyBehavior;
import com.mads2202.patterns.ducksBehavior.flyBehavior.GeneralFly;
import com.mads2202.patterns.ducksBehavior.flyBehavior.NoWayFly;
import com.mads2202.patterns.ducksBehavior.quackBehavior.GeneralQuack;
import com.mads2202.patterns.ducksBehavior.quackBehavior.NoQuack;
import com.mads2202.patterns.ducksBehavior.quackBehavior.QuackBehavior;

public class Main {
    public static void main(String[] args) {
        FlyBehavior nowayFly = new NoWayFly();
        FlyBehavior generalFly = new GeneralFly();
        QuackBehavior noQuack = new NoQuack();
        QuackBehavior generalQuack = new GeneralQuack();
        Duck[] ducks = {new RubberDuck(nowayFly, noQuack), new RedHeadDuck(generalFly, noQuack), new MallardDuck(generalFly, generalQuack)};
        for (Duck duck : ducks) {
            duck.performFly();
            duck.performQuack();
            duck.setQuackBehavior(generalQuack);
            duck.performQuack();
        }

    }
}
