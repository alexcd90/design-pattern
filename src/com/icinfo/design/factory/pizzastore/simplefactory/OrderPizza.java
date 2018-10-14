package com.icinfo.design.factory.pizzastore.simplefactory;

import com.icinfo.design.factory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月07
 */
public class OrderPizza {
    SimplePizzaFactory simplePizzaFactory;
    public OrderPizza(SimplePizzaFactory simplePizzaFactory){
        setFactory(simplePizzaFactory);
    }

    public void setFactory(SimplePizzaFactory simplePizzaFactory) {
        Pizza pizza=null;
        String orderType;
        this.simplePizzaFactory=simplePizzaFactory;
        do {
            orderType=getType();
            pizza=simplePizzaFactory.createPizza(orderType);
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
