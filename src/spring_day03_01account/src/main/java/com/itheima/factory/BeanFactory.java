package com.itheima.factory;

import com.itheima.service.IAccountService;
import com.itheima.utils.TransactionManager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BeanFactory {
    private IAccountService accountService;
    private TransactionManager txmanager;

    public void setAccountService(IAccountService accountService){
        this.accountService = accountService;
    }

    public void setTxmanager(TransactionManager txmanager) {
        this.txmanager = txmanager;
    }



    //添加Service 的z代理对象
    public IAccountService getAccountService(){
        return (IAccountService)Proxy.newProxyInstance(accountService.getClass().getClassLoader(),
                accountService.getClass().getInterfaces(),
                //添加事务支持
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable { Object value = null;
                       try{
                           System.out.println("proxy getService");
                           txmanager.beginTransaction();
                          value = method.invoke(accountService,args);
                          txmanager.commit();
                          return value;
                       }
                       catch (Exception e){
                           txmanager.rollback();
                           throw new RuntimeException(e);
                       }
                       finally {
                           txmanager.release();
                       }
                    }
                });
    }
}
