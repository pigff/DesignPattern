package com.lin.designpattern.watcher;

import android.util.Log;

/**
 * Created by greedy on 2017/10/9.
 */

public class SleepStudent implements IWatcher {
    @Override
    public void update() {
        Log.d("SleepStudent", "zzZZ~");
    }
}
