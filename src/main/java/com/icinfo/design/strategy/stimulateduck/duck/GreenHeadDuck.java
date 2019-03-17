package com.icinfo.design.strategy.stimulateduck.duck;

import com.icinfo.design.strategy.stimulateduck.flybehavior.GoodFlyBehavior;
import com.icinfo.design.strategy.stimulateduck.quackbehavior.GaGaQuackBehavior;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public class GreenHeadDuck extends Duck {

    public GreenHeadDuck() {
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GaGaQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("Green Head");
    }
}
