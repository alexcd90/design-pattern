package com.icinfo.design.decarator.coffeebar.coffee;

import com.icinfo.design.decarator.coffeebar.Drink;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年09月30
 */
public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
