package model;

import java.sql.*;

public class DbConnection {
    private Connection connection;
    public Connection DbConnection(){
        try{

             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/desktoptoko", "root", "");


        }catch (SQLException e){

            e.printStackTrace();
        }

        return connection;

    }


}
