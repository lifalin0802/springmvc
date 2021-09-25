package com.itheima.cglib;

import com.itheima.proxy.IProducer;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
      final Producer producer = new Producer();
       Producer cglibproducer = (Producer) Enhancer.create(producer.getClass(),
                new MethodInterceptor() {
                    @Override
                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                        Object returnValue = null;
                        Float money = (Float)objects[0];
                        if ("saleProducts".endsWith(method.getName())) {
                            returnValue = method.invoke(producer, money * 0.8f);
                        }
                        return returnValue;
                    }
                }
        );
        cglibproducer.saleProducts(12000f);
    }
}

