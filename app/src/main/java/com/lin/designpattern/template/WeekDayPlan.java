package com.lin.designpattern.template;

import android.util.Log;

/**
 * Created by greedy on 2017/10/12.
 */

public abstract class WeekDayPlan {

    private String name;

    public WeekDayPlan(String name) {
        this.name = name;
    }

    public void schedule() {
        Log.d("WeekDayPlan", String.format("%s周末计划开始了", name));
        getUp();
        activity();
        goToBed();
    }

    private void getUp() {
        Log.d("WeekDayPlan", "起床,开始新的一天");
    }

    private void goToBed() {
        Log.d("WeekDayPlan", "睡觉zz");
    }

    abstract void activity();
}
