package com.lin.designpattern.singleton;

/**
 * Created by greedy on 2017/10/7.
 */

public interface SingletonDes {
    /**
     *  单例模式写法主要分:懒汉式、饿汉式、枚举、静态内部类、双重校验锁
     *  懒汉式本身不是线程安全的，所以要在getInstance方法中保证线程安全。
     *  饿汉式天生就是线程安全的。饿汉式在类刚创建出来的时候就实例化一个静态对象出来，不管之后会不会使用这个单例，都会占据一定的内存。
     *  但是相应的，其第一次调用的速度回更快。
     */
}
