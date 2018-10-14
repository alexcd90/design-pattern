package com.icinfo.design.decarator.coffeebar.decorator;

import com.icinfo.design.decarator.coffeebar.Drink;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年09月30
 */
public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj){
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice()+obj.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"----"+super.getPrice()+"&&"+obj.getDescription();
    }
}
