package com.icinfo.design.decarator.coffeebar.decorator;

import com.icinfo.design.decarator.coffeebar.Drink;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年09月30
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        super.setDescription("Milk");
        super.setPrice(2.0f);
    }
}
