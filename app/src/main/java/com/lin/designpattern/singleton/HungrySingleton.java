package com.lin.designpattern.singleton;

/**
 * Created by greedy on 2017/10/7.
 */

public class HungrySingleton {

    private static HungrySingleton sHungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    /**
     * 天生就是线程安全的 并且能够保证唯一。
     * @return
     */
    public HungrySingleton getInstance() {
        return sHungrySingleton;
    }
}
