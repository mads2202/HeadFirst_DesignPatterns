package com.mads2202.patterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop implements Observable {
    private Map<Product, Integer> productsList = new HashMap<Product, Integer>();
    private List<ShopObserver> shopObserverList = new ArrayList<ShopObserver>();

    public Shop(Map<Product, Integer> productsList) {
        this.productsList = productsList;
    }

    public void addProductToShop(Product product, Integer quantity) {
        productsList.put(product, quantity);
        notifyShopObservers();
    }

    @Override
    public void addShopObserver(ShopObserver observer) {
        shopObserverList.add(observer);
    }

    @Override
    public void removeShopObserver(ShopObserver observer) {
        shopObserverList.remove(observer);
    }

    @Override
    public void notifyShopObservers() {
        for (ShopObserver observer : shopObserverList){
            observer.update(productsList);
        }
    }
}