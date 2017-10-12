package com.lin.designpattern.factory;

import android.util.Log;

/**
 * Created by greedy on 2017/10/12.
 */

public class Vegetables implements FactoryFood {

    @Override
    public void notice() {
        Log.d("Vegetables", "vegetables");
    }
}
