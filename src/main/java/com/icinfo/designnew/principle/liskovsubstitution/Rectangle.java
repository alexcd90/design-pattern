package com.icinfo.designnew.principle.liskovsubstitution;

/**
 * @program: design-pattern
 * @description: this is a Rectangle
 * @author: jkk
 * @create: 2019-03-14 23:44
 */
public class Rectangle {

    private long length;
    private long width;

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public long getLength() {
        return length;
    }

    public long getWidth() {
        return width;
    }
}
