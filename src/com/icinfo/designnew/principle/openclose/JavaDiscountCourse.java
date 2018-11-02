package com.icinfo.designnew.principle.openclose;

import java.math.BigDecimal;

/**
 * 描述:  <br>
 *
 * @author jkk
 * @date 2018年11月02
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer ID, String name, BigDecimal price) {
        super(ID, name, price);
    }

    public BigDecimal getOriginPrice(){
       return super.getPrice();
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().multiply(new BigDecimal(0.8));
    }
}
