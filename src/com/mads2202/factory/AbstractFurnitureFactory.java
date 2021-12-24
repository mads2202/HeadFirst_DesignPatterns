package com.mads2202.factory;

import com.mads2202.furniture.chair.Chair;
import com.mads2202.furniture.sofa.Sofa;
import com.mads2202.furniture.table.Table;

public interface AbstractFurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    Table createTable();
}
