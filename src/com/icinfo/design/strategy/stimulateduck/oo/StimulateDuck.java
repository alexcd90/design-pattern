package com.icinfo.design.strategy.stimulateduck.oo;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public class StimulateDuck {
    public static void main(String[] args) {
        GreenHeadDuck greenHeadDuck = new GreenHeadDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        greenHeadDuck.display();
        greenHeadDuck.Quack();
        greenHeadDuck.Fly();
        greenHeadDuck.Swim();
        System.out.println("-----------------------");
        redHeadDuck.Fly();
        redHeadDuck.display();
        redHeadDuck.Swim();
        redHeadDuck.Quack();
    }
}
