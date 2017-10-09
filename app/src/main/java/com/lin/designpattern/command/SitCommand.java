package com.lin.designpattern.command;

/**
 * Created by greedy on 2017/10/9.
 */

public class SitCommand implements ICommand {

    private Dog mDog;

    public SitCommand(Dog dog) {
        mDog = dog;
    }

    @Override
    public void execute() {
        mDog.sit();
    }
}
