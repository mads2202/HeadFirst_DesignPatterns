package com.mads2202.patterns;

import java.util.Map;

public interface ShopObserver {
    void update(Map<Product,Integer> productsList);
}