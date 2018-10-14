package com.icinfo.design.strategy.stimulateduck;

import com.icinfo.design.strategy.stimulateduck.duck.Duck;
import com.icinfo.design.strategy.stimulateduck.duck.GreenHeadDuck;
import com.icinfo.design.strategy.stimulateduck.duck.RedHeadDuck;
import com.icinfo.design.strategy.stimulateduck.flybehavior.NoFlyBehavior;
import com.icinfo.design.strategy.stimulateduck.quackbehavior.NoQuackBehavior;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public class StimulateDuck {
    public static void main(String[] args) {
        Duck greenHeadDuck = new GreenHeadDuck();
        greenHeadDuck.display();
        greenHeadDuck.fly();
        greenHeadDuck.quack();
        greenHeadDuck.swim();

        System.out.println("------------------------");

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.fly();
        redHeadDuck.setFlyBehavior(new NoFlyBehavior());
        redHeadDuck.fly();
        redHeadDuck.quack();
        redHeadDuck.setQuackBehavior(new NoQuackBehavior());
        redHeadDuck.quack();
        redHeadDuck.swim();
    }
}
