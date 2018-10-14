package com.icinfo.design.factory.pizzastore.absfactory;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月14
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza;
        orderPizza=new OrderPizza(new LDFactory());
    }
}
