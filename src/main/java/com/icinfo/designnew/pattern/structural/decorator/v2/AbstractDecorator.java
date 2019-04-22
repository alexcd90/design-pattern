package com.icinfo.designnew.pattern.structural.decorator.v2;

/**
 * @program: design-pattern
 * @description: ${description}
 * @author: jkk
 * @create: 2019-04-22 21:54
 */
public class AbstractDecorator extends ABetterCake{
    private ABetterCake aBetterCake;

    public AbstractDecorator (ABetterCake aBetterCake){
        this.aBetterCake = aBetterCake;
    }


    @Override
    protected String getDesc() {
        return this.aBetterCake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBetterCake.cost();
    }
}
