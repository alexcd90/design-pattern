package com.icinfo.design.singleton;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public class Singleton {
    private static Singleton uniqueInstance=null;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if (uniqueInstance==null){
            uniqueInstance=new Singleton();
        }
        return uniqueInstance;

    }
}
