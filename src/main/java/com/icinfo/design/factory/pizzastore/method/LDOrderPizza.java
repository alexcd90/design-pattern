package com.icinfo.design.factory.pizzastore.method;

import com.icinfo.design.factory.pizzastore.pizza.LDCheesePizza;
import com.icinfo.design.factory.pizzastore.pizza.LDPepperPizza;
import com.icinfo.design.factory.pizzastore.pizza.Pizza;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月07
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equalsIgnoreCase("cheese")){
            pizza=new LDCheesePizza();
        }else if (orderType.equalsIgnoreCase("pepper")){
            pizza=new LDPepperPizza();
        }
        return pizza;
    }
}
