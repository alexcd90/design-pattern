package com.icinfo.designnew.principle.depencyinverse;

/**
 * 描述:  <br>
 *
 * @author jkk
 * @date 2018年11月03
 */
public class Test {
    public static void main(String[] args) {
//        面向具体对象编程

//        Geely geely = new Geely();
//        geely.studyJavaCourse();
//        geely.studyFECourse();
//        geely.studyPythonCourse();

//        面向接口编程V1
//        Geely geely = new Geely();
//        geely.studyMoocCourse(new JavaCourse());
//        geely.studyMoocCourse(new PythonCourse());

//        V2.0
//        Geely geely = new Geely(new JavaCourse());
//        geely.studyMoocCourse();
//        Geely geely2 = new Geely(new PythonCourse());
//        geely2.studyMoocCourse();

//        V3.0

        Geely geely = new Geely();

        geely.setiCourse(new JavaCourse());

        geely.studyMoocCourse();

        geely.setiCourse(new PythonCourse());

        geely.studyMoocCourse();
    }
}
