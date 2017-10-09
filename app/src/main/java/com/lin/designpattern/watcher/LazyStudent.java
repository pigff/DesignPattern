package com.lin.designpattern.watcher;

import android.util.Log;

/**
 * Created by greedy on 2017/10/9.
 */

public class LazyStudent implements IWatcher {
    @Override
    public void update() {
        Log.d("LazyStudent", "老师来了，要快点学习");
    }
}
