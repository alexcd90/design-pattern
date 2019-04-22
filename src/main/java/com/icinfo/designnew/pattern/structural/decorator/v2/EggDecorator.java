package com.icinfo.designnew.pattern.structural.decorator.v2;

/**
 * @program: design-pattern
 * @description: ${description}
 * @author: jkk
 * @create: 2019-04-22 21:57
 */
public class EggDecorator extends  AbstractDecorator{
    public EggDecorator(ABetterCake aBetterCake) {
        super(aBetterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋 ";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
