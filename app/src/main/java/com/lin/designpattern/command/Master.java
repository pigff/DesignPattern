package com.lin.designpattern.command;

/**
 * Created by greedy on 2017/10/9.
 */

public class Master {

    private ICommand runCommand, eatCommand, sitCommand;

    public Master(ICommand runCommand, ICommand eatCommand, ICommand sitCommand) {
        this.runCommand = runCommand;
        this.eatCommand = eatCommand;
        this.sitCommand = sitCommand;
    }

    public void runEatCommand() {
        eatCommand.execute();
    }

    public void runRunCommand() {
        runCommand.execute();
    }

    public void runSitCommand() {
        sitCommand.execute();
    }
}
