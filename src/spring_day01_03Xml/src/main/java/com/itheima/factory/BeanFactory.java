package com.itheima.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
/*
 什么样的工厂？ 创建bean对象的工厂
 Bean mean: 可重用组件，
 */
public class BeanFactory {
    private static Properties properties;
    private static Map<String,Object> beans;
    static {
        properties = new Properties();
        //任何一个class都可以getClassLoader
        InputStream inputStream = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties") ; // InputStream inputStream = new FileInputStream("");
        try {
            properties.load(inputStream); //相对路径src 绝对用不了！因为一部署就没了~！
            beans = new HashMap<String, Object>();
            Enumeration keys = properties.keys();
            while (keys.hasMoreElements()){
                String k = keys.nextElement().toString();
                String v = properties.getProperty(k);
                Object vObj = Class.forName(v).newInstance();
                beans.put(k,vObj);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("initialize properties 失败");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static <T> T getBean(String beanName) {
        return (T) beans.get(beanName);
    }

}
