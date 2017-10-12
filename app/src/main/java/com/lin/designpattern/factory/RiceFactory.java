package com.lin.designpattern.factory;

/**
 * Created by greedy on 2017/10/12.
 */

public class RiceFactory implements Factory {
    @Override
    public FactoryFood createFood() {
        return new Rice();
    }
}
