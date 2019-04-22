package com.icinfo.designnew.pattern.structural.decorator.v1;

/**
 * @program: design-pattern
 * @description: ${description}
 * @author: jkk
 * @create: 2019-04-22 21:47
 */
public class EggSausageBetterCake extends EggBetterCake {
    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
