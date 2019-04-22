package com.icinfo.designnew.pattern.structural.decorator.v2;

/**
 * @program: design-pattern
 * @description: ${description}
 * @author: jkk
 * @create: 2019-04-22 22:00
 */
public class Test {
    public static void main(String[] args) {
        ABetterCake aBetterCake;
        aBetterCake = new BetterCake();
        aBetterCake = new EggDecorator(aBetterCake);
        aBetterCake = new EggDecorator(aBetterCake);
        aBetterCake = new SausageDecorator(aBetterCake);

        System.out.println(aBetterCake.getDesc() + " 销售价格：" + aBetterCake.cost());

    }
}
