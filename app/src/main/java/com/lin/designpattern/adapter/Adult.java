package com.lin.designpattern.adapter;

/**
 * Created by greedy on 2017/10/12.
 */

public class Adult {

    public static final String TYPE = "adult";

    private String type;
    private int age;
    private String name;

    public Adult() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Adult{" +
                "type='" + type + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
