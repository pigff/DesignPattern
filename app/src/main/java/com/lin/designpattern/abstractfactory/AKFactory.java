package com.lin.designpattern.abstractfactory;

/**
 * Created by greedy on 2017/10/12.
 */

public class AKFactory implements AbstractFactory {
    @Override
    public Amm createAmm() {
        return new AK47Amm();
    }

    @Override
    public Weapon createWeapon() {
        return new Ak47();
    }
}
