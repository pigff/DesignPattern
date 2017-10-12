package com.lin.designpattern.faced;

/**
 * Created by greedy on 2017/10/12.
 */

public class WeekDay {

    private Air mAir;
    private Food mFood;
    private Tv mTv;

    public WeekDay(Air air, Food food, Tv tv) {
        mAir = air;
        mFood = food;
        mTv = tv;
    }

    public void enjoyWeekDay(String foodName) {
        mAir.openAir();
        mTv.openTv();
        mFood.eat(foodName);
    }

    public void endWeekDay() {
        mTv.closeTv();
        mAir.closeAir();
    }
}
