package com.icinfo.designnew.pattern.creational.builder.v2;


import com.google.common.collect.ImmutableSet;

/**
 * @program: design-pattern
 * @description: ${description}
 * @author: jkk
 * @create: 2019-03-23 22:46
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .buildCourseName("Java设计模式精讲")
                .buildCoursePPT("Java设计模式精讲PPT")
                .buildCourseVideo("Java设计模式精讲视频")
                .build();
        System.out.println(course);

        ImmutableSet<String> set = ImmutableSet.<String>builder().add("aa").add("bb").build();
        System.out.println(set);
    }
}
