package com.icinfo.designnew.principle.compositionaggregation;

/**
 * 描述:  <br>
 *
 * @author jkk
 * @date 2018年11月03
 */
public class Test {
    public static void main(String[] args) {
        ProductionDao productionDao = new ProductionDao();
        productionDao.setConnection(new PostgresConnection());
        productionDao.addProduct();
    }
}
