package com.mads2202.factory;

import com.mads2202.furniture.chair.Chair;
import com.mads2202.furniture.chair.ModernChair;
import com.mads2202.furniture.sofa.ModernSofa;
import com.mads2202.furniture.sofa.Sofa;
import com.mads2202.furniture.table.ModernTable;
import com.mads2202.furniture.table.Table;

public class ModernFurnitureFactory implements AbstractFurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
