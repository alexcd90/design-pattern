package com.icinfo.designnew.pattern.creational.abstractfactory;

/**
 * @program: design-pattern
 * @description: ${description}
 * @author: jkk
 * @create: 2019-03-17 18:25
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制python课程视频");
    }
}
