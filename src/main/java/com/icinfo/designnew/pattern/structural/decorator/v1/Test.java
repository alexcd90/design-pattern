package com.icinfo.designnew.pattern.structural.decorator.v1;

/**
 * @program: design-pattern
 * @description: ${description}
 * @author: jkk
 * @create: 2019-04-22 21:48
 */
public class Test {
    public static void main(String[] args) {
        BetterCake betterCake = new BetterCake();
        System.out.println(betterCake.getDesc()+" 销售价格：" +betterCake.cost());

        EggBetterCake eggBetterCake = new EggBetterCake();
        System.out.println(eggBetterCake.getDesc()+" 销售价格:"+eggBetterCake.cost());

        EggSausageBetterCake eggSausageBetterCake = new EggSausageBetterCake();

        System.out.println(eggSausageBetterCake.getDesc()+" 销售价格:"+eggSausageBetterCake.cost());

    }
}
