package com.lin.designpattern.state;

import android.util.Log;

/**
 * Created by greedy on 2017/10/13.
 */

public class OpenState extends ReboundSwitchState {
    @Override
    public void press(ReboundContext context) {
        Log.d("OpenState", "电灯开");
        context.setState(new CloseState());
    }
}
