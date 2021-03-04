package br.com.mercadogod.dal;

import java.sql.*;

public class ConnectionModule {
    public static Connection connection(){
        Connection connection;
        String URL = "jdbc:mysql://localhost:3306/mercadogod?useTimezone=true&serverTimezone=UTC";
        String USER = "root";
        String PASSWORD = "";
        try{
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            return connection;
        }catch(SQLException e){
            return null;
        }
    }
}
