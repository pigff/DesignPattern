package com.lin.designpattern.faced;

import android.util.Log;

/**
 * Created by greedy on 2017/10/12.
 */

public class Food {

    public void eat(String foodName) {
        Log.d("Food", String.format("吃%s", foodName));
    }
}
