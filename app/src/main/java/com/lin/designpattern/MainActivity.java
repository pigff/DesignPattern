package com.lin.designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.lin.designpattern.abstractfactory.AKFactory;
import com.lin.designpattern.abstractfactory.Amm;
import com.lin.designpattern.abstractfactory.EigthNightKFactory;
import com.lin.designpattern.abstractfactory.M416Factory;
import com.lin.designpattern.abstractfactory.Weapon;
import com.lin.designpattern.adapter.AdultAdapter;
import com.lin.designpattern.adapter.Child;
import com.lin.designpattern.command.Dog;
import com.lin.designpattern.command.EatCommand;
import com.lin.designpattern.command.Master;
import com.lin.designpattern.command.RunCommand;
import com.lin.designpattern.command.SitCommand;
import com.lin.designpattern.faced.Air;
import com.lin.designpattern.faced.Food;
import com.lin.designpattern.faced.Tv;
import com.lin.designpattern.faced.WeekDay;
import com.lin.designpattern.factory.FactoryFood;
import com.lin.designpattern.factory.MeatFactory;
import com.lin.designpattern.factory.RiceFactory;
import com.lin.designpattern.factory.SimpleFactory;
import com.lin.designpattern.factory.VegetablesFactory;
import com.lin.designpattern.strategy.Animal;
import com.lin.designpattern.strategy.CatBark;
import com.lin.designpattern.strategy.DogBark;
import com.lin.designpattern.template.LucyWeekDayPlan;
import com.lin.designpattern.template.TonyWeekDayPlan;
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

        // --------------------- 适配器模式 --------------------- //
        Log.d("MainActivity", "--------------------- 适配器模式 ---------------------");
        Child child = new Child(Child.TYPE, 8, "tony");
        Log.d("MainActivity", child.toString());
        Log.d("MainActivity", new AdultAdapter().getAdult(child).toString());
        // --------------------- 外观模式 --------------------- //
        Log.d("MainActivity", "--------------------- 外观模式 --------------------- ");
        Air air = new Air();
        Food food = new Food();
        Tv tv = new Tv();
        Log.d("MainActivity", "使用外观模式前");
        tv.openTv();
        air.openAir();
        food.eat("乐事薯片");

        tv.closeTv();
        air.closeAir();
        Log.d("MainActivity", "使用外观模式后");
        WeekDay weekDay = new WeekDay(air, food, tv);
        weekDay.endWeekDay();
        weekDay.endWeekDay();
        // --------------------- 模板方法 --------------------- //
        LucyWeekDayPlan lucyPlan = new LucyWeekDayPlan();
        lucyPlan.schedule();
        TonyWeekDayPlan tonyPlan = new TonyWeekDayPlan();
        tonyPlan.schedule();
        // --------------------- 工厂方法 --------------------- //
        // --------------------- 简单工厂 --------------------- //
        Log.d("MainActivity", "简单工厂");
        SimpleFactory simpleFactory = new SimpleFactory();
        FactoryFood simplefood = simpleFactory.createFood(0);
        simplefood.notice();
        simplefood = simpleFactory.createFood(1);
        simplefood.notice();
        simplefood = simpleFactory.createFood(2);
        simplefood.notice();
        Log.d("MainActivity", "工厂方法");
        simplefood = new RiceFactory().createFood();
        simplefood.notice();
        simplefood = new MeatFactory().createFood();
        simplefood.notice();
        simplefood = new VegetablesFactory().createFood();
        simplefood.notice();
        // --------------------- 抽象工厂 --------------------- //
        Log.d("MainActivity", "抽象工厂");
        Amm amm = new AKFactory().createAmm();
        Weapon weapon = new AKFactory().createWeapon();
        amm.printName();
        weapon.printName();
        amm = new EigthNightKFactory().createAmm();
        weapon = new EigthNightKFactory().createWeapon();
        amm.printName();
        weapon.printName();
        amm = new M416Factory().createAmm();
        weapon = new M416Factory().createWeapon();
        amm.printName();
        weapon.printName();
    }
}
