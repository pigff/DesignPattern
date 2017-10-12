package com.lin.designpattern.faced;

import android.util.Log;

/**
 * Created by greedy on 2017/10/12.
 */

public class Tv {

    //频道
    private String channel;

    public Tv() {
        channel = "1";
    }

    public void openTv() {
        Log.d("Tv", "打开电视机");
    }

    public void closeTv() {
        Log.d("Tv", "关闭电视机");
    }

    public void chooseChannel(String channel){
        this.channel = channel;
        Log.d("Tv", String.format("选择%s频道", this.channel));
    }

}
