package com.xunnan.springboot.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author lining
 * @date 2020/12/15 - 20:47
 */
public class JdbcTest01 {


    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://47.106.23.62:3306/mljz?useUnicode=true&useSLL=true&characterEncodeing=utf8";
            String username = "root";
            String password = "1qazXSW@#$";

            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();


            ResultSet resultSet = statement.executeQuery("select * from b_user where id = 8808");

            while (resultSet.next()) {
                System.out.println(resultSet.getObject("NICK_NAME"));
            }


            resultSet.close();
            statement.close();
            connection.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
