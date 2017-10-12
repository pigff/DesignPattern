package com.lin.designpattern.abstractfactory;

/**
 * Created by greedy on 2017/10/12.
 */

public class EigthNightKFactory implements AbstractFactory {
    @Override
    public Amm createAmm() {
        return new NightEightKAmm();
    }

    @Override
    public Weapon createWeapon() {
        return new NightEightK();
    }
}
