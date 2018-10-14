package com.icinfo.design.factory.pizzastore.method;

import com.icinfo.design.factory.pizzastore.pizza.*;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月07
 */
public class NYOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equalsIgnoreCase("cheese")){
            pizza=new NYCheesePizza();
        }else if (orderType.equalsIgnoreCase("pepper")){
            pizza=new NYPepperPizza();
        }
        return pizza;
    }
}
