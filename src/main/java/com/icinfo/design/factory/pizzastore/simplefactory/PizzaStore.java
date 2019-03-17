package com.icinfo.design.factory.pizzastore.simplefactory;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月07
 */
public class PizzaStore {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory;
        OrderPizza orderPizza;
        orderPizza=new OrderPizza(new SimplePizzaFactory());
    }
}
