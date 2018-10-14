package com.icinfo.design.strategy.stimulateduck.oo;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public class GreenHeadDuck extends Duck{

    @Override
    public void display() {
        System.out.println("***GreenHead***");
    }

    @Override
    public void Fly() {
        System.out.println("***no fly***");;
    }
}
