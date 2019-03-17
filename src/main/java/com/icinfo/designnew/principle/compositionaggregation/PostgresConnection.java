package com.icinfo.designnew.principle.compositionaggregation;

/**
 * 描述:  <br>
 *
 * @author jkk
 * @date 2018年11月03
 */
public class PostgresConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "Postgres数据库连接";
    }
}
