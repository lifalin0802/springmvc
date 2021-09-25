package com.itheima.utils;


import javax.sql.DataSource;
import java.sql.Connection;

public class ConnectionUtils {
    private ThreadLocal<Connection> tl = new ThreadLocal<Connection>();

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public Connection getThreadConnection(){
        try{
            Connection conn = tl.get();
            if(conn == null){
            conn = dataSource.getConnection();
            tl.set(conn);
            }
            return conn;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    //将连接 释放掉 因为close只是关闭javaWeb中的thread, 但关了的thread 依旧绑着连接
    public void removeConnction(){
        tl.remove();
    }
}
