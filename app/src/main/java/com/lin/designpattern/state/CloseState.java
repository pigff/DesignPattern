package com.lin.designpattern.state;

import android.util.Log;

/**
 * Created by greedy on 2017/10/13.
 */

public class CloseState extends ReboundSwitchState {
    @Override
    public void press(ReboundContext context) {
        Log.d("CloseState", "电灯关");
        context.setState(new OpenState());
    }
}
