package com.itheima.service.impl;

        import com.itheima.service.IAccountService;
        import java.util.Date;

public class AccountService implements IAccountService {

    //经常变化的数据 不适用DI
    private  String name;
    private  int age;
    private Date birthDay;

    public AccountService(String name,int age,Date birthDay){
        this.name = name;
        this.age = age;
        this.birthDay = birthDay;
    }

    public AccountService(){}

    public void saveAccount() {
        System.out.println("saveAccount b被调用了");
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}
