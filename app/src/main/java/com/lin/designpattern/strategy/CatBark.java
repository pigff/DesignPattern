package com.lin.designpattern.strategy;

import android.util.Log;

/**
 * Created by greedy on 2017/10/8.
 */

public class CatBark implements IBark {

    @Override
    public void bark() {
        Log.d("CatBark", "喵~~~~~~~");
    }
}
