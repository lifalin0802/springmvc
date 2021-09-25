package com.itheima.service.impl;

        import com.itheima.service.IAccountService;

public class AccountService implements IAccountService {

    /* 配合以下使用
    <bean id="accountService" class="com.itheima.service.impl.AccountService"></bean>* */
    public AccountService(){
        System.out.println("默认构造函数运行了！！");
    }

    public AccountService(String name){
        System.out.println(" 对象被创建！使用的参数args：" + name.toString());
    }

    public void saveAccount() {
        System.out.println("saveAccount b被调用了");
    }
    public void init() {
        System.out.println(" init 对象被创建了");
    }
    public void distroy() {
        System.out.println("distroy 对象被销毁了");
    }

}
