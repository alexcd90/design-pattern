package com.icinfo.design.factory.pizzastore.absfactory;

import com.icinfo.design.factory.pizzastore.pizza.LDCheesePizza;
import com.icinfo.design.factory.pizzastore.pizza.LDPepperPizza;
import com.icinfo.design.factory.pizzastore.pizza.Pizza;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月07
 */
public class NYFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;

    }
}
