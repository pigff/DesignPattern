package com.lin.designpattern.abstractfactory;

/**
 * Created by greedy on 2017/10/12.
 */

public class M416Factory implements AbstractFactory {
    @Override
    public Amm createAmm() {
        return new M416Amm();
    }

    @Override
    public Weapon createWeapon() {
        return new M416();
    }
}
