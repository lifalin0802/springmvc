package com.itheima.utils;

public class TransactionManager {

    private ConnectionUtils connectionUtils;

    public void setConnectionUtils(ConnectionUtils connectionUtils) {

        this.connectionUtils = connectionUtils;
    }

    public void beginTransaction(){
        try {
            connectionUtils.getThreadConnection().setAutoCommit(false);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public void commit(){
        try {
            connectionUtils.getThreadConnection().commit();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public void rollback(){
        try {
            connectionUtils.getThreadConnection().rollback();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public void release(){
        try {
            connectionUtils.getThreadConnection().close();
            connectionUtils.removeConnction();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }


}
