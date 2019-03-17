package com.icinfo.design.decarator.coffeebar;

import com.icinfo.design.decarator.coffeebar.coffee.Decaf;
import com.icinfo.design.decarator.coffeebar.decorator.Chocolate;
import com.icinfo.design.decarator.coffeebar.decorator.Milk;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年09月30
 */
public class CoffeeBar {
    public static void main(String[] args) {
        Drink order;
        order = new Decaf();
        System.out.println("order-1 price "+order.cost());
        System.out.println("order-1 desc "+order.getDescription());

        System.out.println("******************************");
        order=new Decaf();
        order=new Milk(order);
        order=new Chocolate(order);
        System.out.println("order-2 price "+order.cost());
        System.out.println("order-2 desc "+order.getDescription());
    }
}
