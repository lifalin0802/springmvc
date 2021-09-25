package com.itheima.service.impl;

import com.itheima.service.IAccountService;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class AccountService3 implements IAccountService {

    private String[] myStrs;

    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    private List<String> myList;
    private Set<String> mySet;
    private Map<String,String> myMap;
    private Properties myProps;


    public void saveAccount(){
        System.out.println("AccountSrc3 被调用了");
        System.out.println(myList);
        System.out.println(myMap);
    }
}




