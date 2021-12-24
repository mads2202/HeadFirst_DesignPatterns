package com.mads2202.factory;

import com.mads2202.furniture.chair.Chair;
import com.mads2202.furniture.chair.OldFashionChair;
import com.mads2202.furniture.sofa.OldFashionSofa;
import com.mads2202.furniture.sofa.Sofa;
import com.mads2202.furniture.table.OldFashionTable;
import com.mads2202.furniture.table.Table;

public class OldFashionFurnitureFactory implements AbstractFurnitureFactory{
    @Override
    public Chair createChair() {
        return new OldFashionChair();
    }

    @Override
    public Sofa createSofa() {
        return new OldFashionSofa();
    }

    @Override
    public Table createTable() {
        return new OldFashionTable();
    }
}
