package com.itheima.proxy;

public class Producer implements IProducer{
    public void saleProducts(float money){
        System.out.println("sales:" + money);
    }
    public void afterService(float money){
        System.out.println("afterService:" + money);
    }
}
