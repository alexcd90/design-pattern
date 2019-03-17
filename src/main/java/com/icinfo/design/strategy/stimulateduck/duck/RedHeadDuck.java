package com.icinfo.design.strategy.stimulateduck.duck;

import com.icinfo.design.strategy.stimulateduck.flybehavior.BadFlyBehavior;
import com.icinfo.design.strategy.stimulateduck.quackbehavior.GeGeQuackBehavior;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new GeGeQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("Red Head");
    }
}
