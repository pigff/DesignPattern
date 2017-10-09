package com.lin.designpattern.command;

/**
 * Created by greedy on 2017/10/9.
 */

public class EatCommand implements ICommand{

    private Dog mDog;

    public EatCommand(Dog dog) {
        mDog = dog;
    }


    @Override
    public void execute() {
        mDog.eat();
    }
}
