package com.icinfo.designnew.pattern.creational.builder;

/**
 * @program: design-pattern
 * @description: ${description}
 * @author: jkk
 * @create: 2019-03-23 22:23
 */
public class Test {
    public static void main(String[] args) {
        Coach coach = new Coach();
        CourseActualBuilder courseActualBuilder = new CourseActualBuilder();
        coach.setCourseBuilder(courseActualBuilder);
        Course course = coach.makeCourse("Java设计模式精讲",
                "Java设计模式精讲PPT",
                "Java设计模式精讲视频",
                "Java设计模式精讲手记");
        System.out.println(course);
    }
}
