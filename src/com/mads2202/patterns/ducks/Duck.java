package com.mads2202.patterns.ducks;

import com.mads2202.patterns.ducksBehavior.flyBehavior.FlyBehavior;
import com.mads2202.patterns.ducksBehavior.quackBehavior.QuackBehavior;

//это супер класс который наследуют все другие утки
public class Duck {
    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    // Это поле с супертипом интерфейса для того чтобы реализовать паттерн стратегию.
    // Сюда будет подставляться конкретный класс инкапсулирующий алгоритм полёта
    private FlyBehavior flyBehavior;
    // Это поле с супертипом интерфейса для того чтобы реализовать паттерн стратегию.
    // Сюда будет подставляться конкретный класс инкапсулирующий алгоритм крякания
    private QuackBehavior quackBehavior;

    // Этот метод нужен для динамического изменения алгоритма полёта.
    // Сюда мы можем подставить класс который инкапсулирует другой алгоритм полёта и имплементирует интерфейс FlyBehavior
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    // Этот метод нужен для динамического изменения алгоритма крякания.
    // Сюда мы можем подставить класс который инкапсулирует другой алгоритм полёта и имплементирует интерфейс QuackBehavior
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println(this.toString() + " is swimming");
    }

    public void display() {
        System.out.println(this.getClass().getName());
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}