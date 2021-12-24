package com.mads2202;

import com.mads2202.coffee.Coffee;
import com.mads2202.coffee.Latte;
import com.mads2202.toppingsDecorators.Milk;
import com.mads2202.toppingsDecorators.Sugar;
import com.mads2202.toppingsDecorators.Syrup;

public class Main {
    public static void main(String[] args) {
        Coffee latte = new Milk(new Sugar(new Syrup(new Latte())));
        System.out.println(latte.cost());
        System.out.println(latte.getDescription());
    }
}