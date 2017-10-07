package com.lin.designpattern.singleton;

/**
 * Created by greedy on 2017/10/7.
 * 懒汉单例模式
 */

public class LazySingleton {

    private static LazySingleton sLazySingleton = null;

    private static class LazyHolder {
        private static LazySingleton INSTANCE = new LazySingleton();
    }

    private LazySingleton() {
    }

    /**
     * 无法保证在多线程的环境下代码能正常运行
     * @return
     */
    public static LazySingleton getInstance1() {
        if (sLazySingleton == null) {
            sLazySingleton = new LazySingleton();
        }
        return sLazySingleton;
    }

    /**
     * 每次调用这个方法都需要保证同步，浪费性能
     * @return
     */
    public static synchronized LazySingleton getInstance2() {
        if (sLazySingleton == null) {
            sLazySingleton = new LazySingleton();
        }
        return sLazySingleton;
    }

    /**
     * 双重检索，保证只有第一次为空的情况下，才保持同步。
     * @return
     */
    public static LazySingleton getInstance3() {
        if (sLazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (sLazySingleton == null) {
                    sLazySingleton = new LazySingleton();
                }
            }
        }
        return sLazySingleton;
    }

    /**
     *利用了classloader的机制来保证初始化instance时只有一个线程
     * @return
     */
    public static LazySingleton getInstance4() {
        return LazyHolder.INSTANCE;
    }
}
