package com.icinfo.design.factory.pizzastore.absfactory;

import com.icinfo.design.factory.pizzastore.pizza.Pizza;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月07
 */
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
