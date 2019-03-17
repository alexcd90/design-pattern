package com.icinfo.designnew.principle.liskovsubstitution;

/**
 * @program: design-pattern
 * @description: ${description}
 * @author: jkk
 * @create: 2019-03-14 23:53
 */
public class Test {

    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("width:"+rectangle.getWidth()+" length:"+rectangle.getLength());
        }
        System.out.println("resize方法结束 width:"+rectangle.getWidth() + " length:"+rectangle.getLength());
    }

    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.setWidth(10);
//        rectangle.setLength(20);
//        resize(rectangle);

        SquareOfRectangle square1 = new SquareOfRectangle();
        square1.setSidelength(2);
        resize(square1);


//        Square square = new Square();
//        square.setSidelength(10);
//        Error:(27, 16) java: 不兼容的类型: com.icinfo.designnew.principle.liskovsubstitution.Square无法转换为com.icinfo.designnew.principle.liskovsubstitution.Rectangle
//        resize(square);

    }
}
