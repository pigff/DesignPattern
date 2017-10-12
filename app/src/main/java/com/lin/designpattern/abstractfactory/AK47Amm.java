package com.lin.designpattern.abstractfactory;

import android.util.Log;

/**
 * Created by greedy on 2017/10/12.
 */

public class AK47Amm implements Amm {
    @Override
    public void printName() {
        Log.d("AK47AMM", "AK47_AMM");
    }
}
