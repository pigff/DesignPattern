package com.lin.designpattern.factory;

/**
 * Created by greedy on 2017/10/12.
 */

public class SimpleFactory {

    public FactoryFood createFood(int type) {
        switch (type) {
            case 0:
                return new Rice();
            case 1:
                return new Meat();
            case 2:
                return new Vegetables();
            default:
                return null;
        }
    }
}
