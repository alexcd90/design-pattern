package com.icinfo.design.factory.pizzastore.pizza;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月07
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("LDPepperPizza");
        System.out.println(name+"preparing;");
    }
}
