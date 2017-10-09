package com.lin.designpattern.watcher;

import android.util.Log;

/**
 * Created by greedy on 2017/10/9.
 */

public class EffortStudent implements IWatcher {
    @Override
    public void update() {
        Log.d("EffortStudent", "老师来了，我需要问他一些问题");
    }
}
