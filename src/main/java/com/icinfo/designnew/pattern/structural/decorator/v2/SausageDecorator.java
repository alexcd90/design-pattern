package com.icinfo.designnew.pattern.structural.decorator.v2;

/**
 * @program: design-pattern
 * @description: ${description}
 * @author: jkk
 * @create: 2019-04-22 21:59
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABetterCake aBetterCake) {
        super(aBetterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个香肠 ";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
