package com.icinfo.designnew.pattern.creational.singleton;

import java.io.*;

/**
 * @program: design-pattern
 * @description: ${description}
 * @author: jkk
 * @create: 2019-04-05 21:00
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Thread thread1 = new Thread(new T());
//        Thread thread2 = new Thread(new T());
//        thread1.start();
//        thread2.start();
//        System.out.println("运行结束。。");

//        序列化和反序列化损坏单例对象

        HungrySingleton instance = HungrySingleton.getInstance();

//        将对象序列化写入文件
        ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oss.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(newInstance == instance);


    }
}
