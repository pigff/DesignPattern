package com.lin.designpattern.abstractfactory;

import android.util.Log;

/**
 * Created by greedy on 2017/10/12.
 */

public class NightEightKAmm implements Amm {
    @Override
    public void printName() {
        Log.d("NightEightKAmm", "98kAmm");
    }
}
