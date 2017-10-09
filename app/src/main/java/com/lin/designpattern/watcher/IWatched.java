package com.lin.designpattern.watcher;

/**
 * Created by greedy on 2017/10/9.
 */

public interface IWatched {

    void addWatcher(IWatcher watcher);

    void removeWatcher(IWatcher watcher);

    void notifyAllWatcher();
}
