package com.lin.designpattern.state;

/**
 * Created by greedy on 2017/10/13.
 */

public class ReboundSwitch implements ReboundContext {
    private ReboundSwitchState mState;

    public ReboundSwitch() {
        mState = new CloseState();
    }

    @Override
    public void setState(ReboundSwitchState state) {
        this.mState = state;
    }

    @Override
    public void press() {
        mState.press(this);
    }


}
