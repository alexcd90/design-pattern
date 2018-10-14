package com.icinfo.design.strategy.stimulateduck.oo;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public class StoneDuck extends Duck {
    @Override
    public void Quack() {
        System.out.println("***no gaga***");;
    }

    @Override
    public void display() {
        System.out.println("***StoneDuck***");
    }

    @Override
    public void Swim() {
        System.out.println("***no swim***");
    }

    @Override
    public void Fly() {
        System.out.println("***no fly***");
    }
}
