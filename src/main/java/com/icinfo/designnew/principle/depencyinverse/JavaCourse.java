package com.icinfo.designnew.principle.depencyinverse;

/**
 * 描述:  <br>
 *
 * @author jkk
 * @date 2018年11月03
 */
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习Java课程");
    }
}
