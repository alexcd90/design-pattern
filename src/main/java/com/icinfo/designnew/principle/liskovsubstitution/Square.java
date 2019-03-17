package com.icinfo.designnew.principle.liskovsubstitution;

/**
 * @program: design-pattern
 * @description: this is a square
 * @author: jkk
 * @create: 2019-03-14 23:48
 */
public class Square implements Quadrangle{
    private long sidelength;

    public void setSidelength(long sidelength) {
        this.sidelength = sidelength;
    }

    public long getSidelength() {
        return sidelength;
    }

    @Override
    public long getWidth() {
        return sidelength;
    }

    @Override
    public long getLength() {
        return sidelength;
    }
}
