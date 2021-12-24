package com.mads2202;

import com.mads2202.pizzas.PizzaType;
import com.mads2202.stores.CommonRussianPizzaStore;
import com.mads2202.stores.PizzaStore;
import com.mads2202.stores.RealItalianPizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore italianPizzaStore = new RealItalianPizzaStore();
        italianPizzaStore.orderPizza(PizzaType.PEPERONI);
        PizzaStore russianPizzaStore = new CommonRussianPizzaStore();
        russianPizzaStore.orderPizza(PizzaType.PEPERONI);

    }
}