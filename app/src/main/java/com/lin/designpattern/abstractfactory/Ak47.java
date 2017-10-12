package com.lin.designpattern.abstractfactory;

import android.util.Log;

/**
 * Created by greedy on 2017/10/12.
 */

public class Ak47 implements Weapon {
    @Override
    public void printName() {
        Log.d("Ak47", "Ak47");
    }
}
