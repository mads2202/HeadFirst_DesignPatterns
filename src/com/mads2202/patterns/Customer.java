package com.mads2202.patterns;

import java.util.HashMap;
import java.util.Map;


public class Customer implements ShopObserver {
    private String name;
    private String email;
    private Map<Product, Integer> wishList = new HashMap<Product, Integer>();

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void addProductToWishList(Product product, Integer quantity) {
        wishList.put(product, quantity);
    }

    public void removeProductToWishList(Product product) {
        if (wishList.containsKey(product)) {
            wishList.remove(product);
        }
    }

    public void buy(Product product) {
        System.out.println(this.toString() + " bought " + product.toString());
    }

    @Override
    public void update(Map<Product, Integer> productsList) {
        for (Product product : productsList.keySet()) {
            if (wishList.containsKey(product)) {
                if (productsList.get(product) >= wishList.get(product)) {
                    buy(product);
                    wishList.remove(product);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}