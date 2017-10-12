package com.lin.designpattern.template;

import android.util.Log;

/**
 * Created by greedy on 2017/10/12.
 */

public class TonyWeekDayPlan extends WeekDayPlan {

    public TonyWeekDayPlan() {
        super("Tony");
    }

    @Override
    void activity() {
        Log.d("TonyWeekDayPlan", "学习");
    }
}
