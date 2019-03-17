package com.icinfo.designnew.pattern.creational.abstractfactory;

/**
 * @program: design-pattern
 * @description: ${description}
 * @author: jkk
 * @create: 2019-03-17 18:26
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写python课程手记");
    }
}
