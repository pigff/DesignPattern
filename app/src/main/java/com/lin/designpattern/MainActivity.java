package com.lin.designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.lin.designpattern.command.Dog;
import com.lin.designpattern.command.EatCommand;
import com.lin.designpattern.command.Master;
import com.lin.designpattern.command.RunCommand;
import com.lin.designpattern.command.SitCommand;
import com.lin.designpattern.strategy.Animal;
import com.lin.designpattern.strategy.CatBark;
import com.lin.designpattern.strategy.DogBark;
import com.lin.designpattern.watcher.EffortStudent;
import com.lin.designpattern.watcher.LazyStudent;
import com.lin.designpattern.watcher.SleepStudent;
import com.lin.designpattern.watcher.Teacher;

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
        // --------------------- 命令模式 --------------------- //
        Log.d("MainActivity", "--------------------- 命令模式 ---------------------");
        Dog dog = new Dog("milk");
        RunCommand runCommand = new RunCommand(dog);
        EatCommand eatCommand = new EatCommand(dog);
        SitCommand sitCommand = new SitCommand(dog);

        Master master = new Master(runCommand, eatCommand, sitCommand);
        master.runEatCommand();
        master.runRunCommand();
        master.runSitCommand();
        // --------------------- 观察者模式 --------------------- //
        Log.d("MainActivity", " --------------------- 观察者模式 --------------------- ");
        Teacher teacher = new Teacher();
        LazyStudent lazyStudent = new LazyStudent();
        SleepStudent sleepStudent = new SleepStudent();
        EffortStudent effortStudent = new EffortStudent();
        teacher.addWatcher(lazyStudent);
        teacher.addWatcher(sleepStudent);
        teacher.addWatcher(effortStudent);
        teacher.notifyAllWatcher();

        teacher.removeWatcher(sleepStudent);
        teacher.notifyAllWatcher();
    }
}
