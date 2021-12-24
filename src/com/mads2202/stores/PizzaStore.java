package com.mads2202.stores;

import com.mads2202.pizzas.Pizza;
import com.mads2202.pizzas.PizzaType;

public abstract class PizzaStore {
    public Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType pizzaType);
}