package com.icinfo.designnew.pattern.structural.decorator.v1;

/**
 * @program: design-pattern
 * @description: ${description}
 * @author: jkk
 * @create: 2019-04-22 21:44
 */
public class EggBetterCake extends BetterCake {
    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+ 1;
    }
}
