package com.icinfo.design.decarator.coffeebar.decorator;

import com.icinfo.design.decarator.coffeebar.Drink;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年09月30
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        super.setDescription("Chocolate");
        super.setPrice(3.0f);
    }
}
