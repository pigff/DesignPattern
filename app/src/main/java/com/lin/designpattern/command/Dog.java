package com.lin.designpattern.command;

import android.util.Log;

/**
 * Created by greedy on 2017/10/9.
 */

public class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void run() {
        Log.d("Dog", String.format("%s is running", name));
    }

    public void sit() {
        Log.d("Dog", String.format("%s is sitting", name));
    }

    public void eat() {
        Log.d("Dog", String.format("%s is eatting", name));
    }
}
