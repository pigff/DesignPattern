package com.lin.designpattern.watcher;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by greedy on 2017/10/9.
 */

public class Teacher implements IWatched{

    private List<IWatcher> mWatchers;

    public Teacher() {
        mWatchers = new ArrayList<>();
    }

    @Override
    public void addWatcher(IWatcher watcher) {
        mWatchers.add(watcher);
    }

    @Override
    public void removeWatcher(IWatcher watcher) {
        mWatchers.remove(watcher);
    }

    @Override
    public void notifyAllWatcher() {
        for (IWatcher watcher : mWatchers) {
            watcher.update();
        }
    }
}
