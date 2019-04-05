package com.icinfo.designnew.pattern.creational.singleton;

/**
 * @program: design-pattern
 * @description: ${description}
 * @author: jkk
 * @create: 2019-04-05 20:59
 */
public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton instance = LazySingleton.getInstance();
        DoubleCheckSingleton instance = DoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+">>>>>"+instance);
    }
}
