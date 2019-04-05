package com.icinfo.designnew.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @program: design-pattern
 * @description: ${description}
 * @author: jkk
 * @create: 2019-04-05 22:10
 */
public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    public Object readResolve(){
        return hungrySingleton;
    }
}
