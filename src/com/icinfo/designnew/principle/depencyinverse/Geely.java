package com.icinfo.designnew.principle.depencyinverse;

/**
 * 描述:  <br>
 *
 * @author jkk
 * @date 2018年11月03
 */
public class Geely {
//    面向具体对象编程

//    public void studyJavaCourse(){
//        System.out.println("Geely在学习Java课程");
//    }
//    public void studyFECourse(){
//        System.out.println("Geely在学习FE课程");
//    }
//    public void studyPythonCourse(){
//        System.out.println("Geely在学习python课程");
//    }

//    方法参数 V1.0
//    public void studyMoocCourse(ICourse course){
//        course.studyCourse();
//    }

//    V2.0

//    private ICourse iCourse;
//
//    public Geely(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }
//
//    public void studyMoocCourse(){
//        iCourse.studyCourse();
//    }

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyMoocCourse(){
        iCourse.studyCourse();
    }
}
