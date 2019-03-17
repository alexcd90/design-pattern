package com.icinfo.design.factory.pizzastore;

import com.icinfo.design.factory.pizzastore.pizza.CheesePizza;
import com.icinfo.design.factory.pizzastore.pizza.PepperPizza;
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
    public OrderPizza() {
        Pizza pizza = null;
        String orderType = null;
        do {
            orderType = getType();
            if (orderType.equalsIgnoreCase("cheese")){
                pizza=new CheesePizza();
            }else if (orderType.equalsIgnoreCase("pepper")){
                pizza=new PepperPizza();
            }else{
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getType() {

        try {
            BufferedReader bf = new BufferedReader(
                    new InputStreamReader(System.in)
            );
            System.out.println("input pizza type:");
            String str = bf.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
