package com.icinfo.design.strategy.stimulateduck.oo;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public abstract class Duck {
    public Duck() {
    }
    public void Quack(){
        System.out.println("~~~gaga~~~");
    }
    public abstract void display();
    public void Swim(){
        System.out.println("~~~Swim~~~");
    }
    public void Fly(){
        System.out.println("~~~Fly~~~");
    }
}
