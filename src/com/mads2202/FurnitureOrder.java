package com.mads2202;

import com.mads2202.factory.AbstractFurnitureFactory;
import com.mads2202.furniture.chair.Chair;
import com.mads2202.furniture.sofa.Sofa;
import com.mads2202.furniture.table.Table;

public class FurnitureOrder {
    private AbstractFurnitureFactory factory;

    public FurnitureOrder(AbstractFurnitureFactory factory) {
        this.factory = factory;
    }
    public Chair orderChair(){
        return factory.createChair();
    }
    public Sofa orderSofa(){
        return factory.createSofa();
    }
    public Table orderTable(){
        return factory.createTable();
    }
}
