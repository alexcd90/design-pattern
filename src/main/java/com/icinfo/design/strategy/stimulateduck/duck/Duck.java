package com.icinfo.design.strategy.stimulateduck.duck;

import com.icinfo.design.strategy.stimulateduck.flybehavior.FlyBehavior;
import com.icinfo.design.strategy.stimulateduck.quackbehavior.QuackBehavior;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }
    public void fly(){
        flyBehavior.fly();
    }
    public void quack(){
        quackBehavior.quack();
    }

    public abstract void display();

    public void swim(){
        System.out.println("swim");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
