package com.lin.designpattern.strategy;

import android.util.Log;

/**
 * Created by greedy on 2017/10/8.
 */

public class Animal {

    private IBark mIBark;

    public Animal() {
        mIBark = new NoBark();
    }

    public void setIBark(IBark iBark) {
        mIBark = iBark;
    }

    public void bark() {
        Log.d("Animal", "------- bark -----");
        mIBark.bark();
    }
}
