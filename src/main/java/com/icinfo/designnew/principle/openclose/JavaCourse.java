package com.icinfo.designnew.principle.openclose;

import java.math.BigDecimal;

/**
 * 描述:  <br>
 *
 * @author jkk
 * @date 2018年11月02
 */
public class JavaCourse implements ICourse {
    private Integer ID;
    private String name;
    private BigDecimal price;

    public JavaCourse(Integer ID, String name, BigDecimal price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getID() {
        return this.ID;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
