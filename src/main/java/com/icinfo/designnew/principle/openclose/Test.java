package com.icinfo.designnew.principle.openclose;

import java.math.BigDecimal;

/**
 * 描述:  <br>
 *
 * @author jkk
 * @date 2018年11月02
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(92, "Java企业级电商开发", new BigDecimal(348.56));
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID: " + javaCourse.getID() + "课程名称：" + javaCourse.getName() +
                "课程原价格：" + javaCourse.getOriginPrice()+"元" + "课程优惠价格：" + javaCourse.getPrice()+"元");
    }
}
