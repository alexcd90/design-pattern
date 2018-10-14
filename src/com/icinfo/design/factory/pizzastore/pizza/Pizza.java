package com.icinfo.design.factory.pizzastore.pizza;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月07
 */
public abstract class Pizza {
    protected String name;
    public abstract void prepare();
    public void bake(){
        System.out.println(name+" baking;");
    }

    public void cut(){
        System.out.println(name+" cutting;");
    }

    public void box(){
        System.out.println(name +" boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
