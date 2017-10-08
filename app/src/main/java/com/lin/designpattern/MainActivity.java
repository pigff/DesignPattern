package com.lin.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.lin.designpattern.strategy.Animal;
import com.lin.designpattern.strategy.CatBark;
import com.lin.designpattern.strategy.DogBark;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // --------------------- 策略模式 --------------------- //
        Log.d("MainActivity", "--------------------- 策略模式 --------------------- ");
        Animal animal = new Animal();
        animal.bark();
        animal.setIBark(new DogBark());
        animal.bark();
        animal.setIBark(new CatBark());
        animal.bark();
    }
}
