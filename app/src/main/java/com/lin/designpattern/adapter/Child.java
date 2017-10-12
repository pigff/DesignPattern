package com.lin.designpattern.adapter;

/**
 * Created by greedy on 2017/10/12.
 */

public class Child {

    public static final String TYPE = "child";

    private String type;
    private int age;
    private String name;

    public Child(String type, int age, String name) {
        this.type = type;
        this.age = age;
        this.name = name;
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
        return "Child{" +
                "type='" + type + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
