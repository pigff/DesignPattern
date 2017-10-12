package com.lin.designpattern.adapter;

/**
 * Created by greedy on 2017/10/12.
 */

public class AdultAdapter {

    public Adult getAdult(Child child) {
        Adult adult = new Adult();
        adult.setAge(child.getAge());
        adult.setName(child.getName());
        adult.setType(Adult.TYPE);
        return adult;
    }
}
