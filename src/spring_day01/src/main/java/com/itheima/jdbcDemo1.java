package com.itheima;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class jdbcDemo1 {
      public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //DriverManager.getConnection("",user: "")
          Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
          Properties props = new Properties();
          props.getProperty("");
      }
}
