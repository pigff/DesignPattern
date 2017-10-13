package com.lin.designpattern.state;

/**
 * Created by greedy on 2017/10/13.
 */

public interface ReboundContext {

    void setState(ReboundSwitchState state);

    void press();
}
