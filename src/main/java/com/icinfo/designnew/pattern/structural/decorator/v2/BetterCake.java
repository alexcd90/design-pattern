package com.icinfo.designnew.pattern.structural.decorator.v2;

/**
 * @program: design-pattern
 * @description: ${description}
 * @author: jkk
 * @create: 2019-04-22 21:53
 */
public class BetterCake extends ABetterCake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
