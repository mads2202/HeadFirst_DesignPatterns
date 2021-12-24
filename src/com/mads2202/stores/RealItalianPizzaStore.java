package com.mads2202.stores;

import com.mads2202.pizzas.*;

public class RealItalianPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        return switch (pizzaType) {
            case PEPERONI -> new RealItalianPeperoniPizza();
            case MARGARITA -> new RealItalianMargaritaPizza();
            default -> null;
        };
    }
}