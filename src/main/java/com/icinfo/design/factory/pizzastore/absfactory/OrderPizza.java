package com.icinfo.design.factory.pizzastore.absfactory;


import com.icinfo.design.factory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月14
 */
public class OrderPizza {
    AbsFactory absFactory;
    public OrderPizza(AbsFactory absFactory){
        setFactory(absFactory);
    }

    public void setFactory(AbsFactory absFactory) {
        Pizza pizza = null;
        String orderType;
        this.absFactory=absFactory;
        do {
            orderType=getType();
            pizza=absFactory.createPizza(orderType);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }while (true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(
                    System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();

            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
