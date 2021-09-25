package com.itheima.utils;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component("logger")
public class Logger {


    public void controllerAspect() {
    }
    @Before("com.itheima.service.impl.AccountServiceImpl.saveAccount()")
    public void BeforePrintLog() {
        System.out.println("BeforePrintLog log.....");
    }

    @AfterReturning("com.itheima.service.impl.AccountServiceImpl.saveAccount()")
    public void AfterReturnPrintLog() {
        System.out.println("AfterReturnPrintLog log.....");
    }

    @AfterThrowing("com.itheima.service.impl.AccountServiceImpl.saveAccount()")
    public void AfterThrowingPrintLog() {
        System.out.println("AfterThrowingPrintLog log.....");
    }

    @After("com.itheima.service.impl.AccountServiceImpl.saveAccount()")
    public void AfterPrintLog() {
        System.out.println("AfterPrintLog log.....");
    }
}
