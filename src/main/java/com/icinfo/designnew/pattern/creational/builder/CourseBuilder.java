package com.icinfo.designnew.pattern.creational.builder;

/**
 * @program: design-pattern
 * @description: ${description}
 * @author: jkk
 * @create: 2019-03-23 22:12
 */
public abstract class CourseBuilder {
    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseVideo(String courseVideo);

    public abstract Course makeCourse();
}
