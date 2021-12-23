package com.mads2202.patterns;

public interface Observable {
    void addShopObserver(ShopObserver observer);
    void removeShopObserver(ShopObserver observer);
    void notifyShopObservers();
}
