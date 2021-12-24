package com.mads2202;

import com.mads2202.factory.ModernFurnitureFactory;
import com.mads2202.factory.OldFashionFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureOrder order= new FurnitureOrder(new OldFashionFurnitureFactory());
        System.out.println(order.orderChair().getDescription());
        FurnitureOrder order1= new FurnitureOrder(new ModernFurnitureFactory());
        System.out.println(order1.orderChair().getDescription());
    }
}
