package com.icinfo.design.factory.pizzastore.simplefactory;

import com.icinfo.design.factory.pizzastore.pizza.CheesePizza;
import com.icinfo.design.factory.pizzastore.pizza.PepperPizza;
import com.icinfo.design.factory.pizzastore.pizza.Pizza;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月07
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String orderType){
        Pizza pizza=null;
        if (orderType.equalsIgnoreCase("cheese")){
            pizza=new CheesePizza();
        }else if (orderType.equalsIgnoreCase("pepper")){
            pizza=new PepperPizza();
        }
        return pizza;
    }
}
