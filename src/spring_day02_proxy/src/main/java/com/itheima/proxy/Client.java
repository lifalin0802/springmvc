package com.itheima.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {
    public static void main1(String[] args) {
        final Producer producer = new Producer();
        IProducer proxyProducer = (IProducer) Proxy.newProxyInstance(producer.getClass().getClassLoader(),
                producer.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object returnValue = null;
                        Float money = (Float) args[0];
                        if ("saleProducts".endsWith(method.getName())) {
                            returnValue = method.invoke(producer, money * 0.8f);
                        }
                        return returnValue;
                    }
                }
        );
        proxyProducer.saleProducts(10000f);
    }
}

