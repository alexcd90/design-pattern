package com.icinfo.design.strategy.stimulateduck.flybehavior;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("no fly");
    }
}
