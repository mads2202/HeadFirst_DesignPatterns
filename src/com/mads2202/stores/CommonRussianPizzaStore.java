package com.mads2202.stores;

import com.mads2202.pizzas.MargaritaPizza;
import com.mads2202.pizzas.PeperoniPizza;
import com.mads2202.pizzas.Pizza;
import com.mads2202.pizzas.PizzaType;

public class CommonRussianPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        return switch (pizzaType) {
            case PEPERONI -> new PeperoniPizza();
            case MARGARITA -> new MargaritaPizza();
            default -> null;
        };
    }
}