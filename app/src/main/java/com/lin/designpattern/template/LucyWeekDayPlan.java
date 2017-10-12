package com.lin.designpattern.template;

import android.util.Log;

/**
 * Created by greedy on 2017/10/12.
 */

public class LucyWeekDayPlan extends WeekDayPlan {

    public LucyWeekDayPlan() {
        super("Lucy");
    }

    @Override
    void activity() {
        Log.d("LucyWeekDayPlan", "玩耍");
    }
}
