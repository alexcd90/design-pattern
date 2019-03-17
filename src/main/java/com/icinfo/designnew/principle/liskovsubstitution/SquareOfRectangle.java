package com.icinfo.designnew.principle.liskovsubstitution;

/**
 * @program: design-pattern
 * @description: ${description}
 * @author: jkk
 * @create: 2019-03-15 00:05
 */
public class SquareOfRectangle extends Rectangle {
    private long sidelength;

    public void setSidelength(long sidelength) {
        this.sidelength = sidelength;
    }

    public long getSidelength() {
        return sidelength;
    }

    @Override
    public void setLength(long length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(long width) {
        setSidelength(width);
    }

    @Override
    public long getLength() {
        return getSidelength();
    }

    @Override
    public long getWidth() {
        return getSidelength();
    }
}
