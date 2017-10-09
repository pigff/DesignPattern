package com.lin.designpattern.command;

/**
 * Created by greedy on 2017/10/9.
 */

public class RunCommand implements ICommand {

    private Dog mDog;

    public RunCommand(Dog dog) {
        mDog = dog;
    }

    @Override
    public void execute() {
        mDog.run();
    }
}
