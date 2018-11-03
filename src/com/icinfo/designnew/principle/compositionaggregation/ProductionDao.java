package com.icinfo.designnew.principle.compositionaggregation;

/**
 * 描述:  <br>
 *
 * @author jkk
 * @date 2018年11月03
 */
public class ProductionDao {
//    public void addProduct(){
//        String connection = super.getConnection();
//        System.out.println("使用"+connection+"添加产品");
//    }

    private DBConnection connection;

    public void setConnection(DBConnection connection) {
        this.connection = connection;
    }

    public void addProduct(){
        String connection = this.connection.getConnection();
        System.out.println("使用"+ connection +"添加产品");
    }
}
