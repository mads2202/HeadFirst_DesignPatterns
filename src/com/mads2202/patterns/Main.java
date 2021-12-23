package com.mads2202.patterns;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // создаём магазин. Правда в нём дефецит консолей:(
        Map<Product, Integer> productsMap = new HashMap<>();
        Product ps5 = new Product("Ps5", 450d);
        productsMap.put(ps5, 0);
        Product xbox = new Product("XBox one", 430d);
        productsMap.put(xbox, 0);
        Shop shop = new Shop(productsMap);
        // покупатель 1 который хотел бы купить xbox
        Customer customer1 = new Customer("Mr. XboxLover", "xboxLover54@gamil.ru");
        customer1.addProductToWishList(xbox, 1);
        // покупатель 1 который хотел бы купить ps5
        Customer customer2 = new Customer("Mr. PsLover", "PsLover97@gamil.ru");
        customer2.addProductToWishList(ps5, 1);
        shop.addShopObserver(customer1);
        shop.addShopObserver(customer2);
        shop.addProductToShop(xbox,1);
        shop.addProductToShop(ps5,1);

    }
}
