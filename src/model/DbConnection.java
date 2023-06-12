package model;

import javax.swing.*;
import java.sql.*;

public class DbConnection extends JFrame {
    private Connection connection;

    private boolean status;

    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public Connection DbConnection(){
        setStatus(true);

        try{

             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/desktoptoko", "root", "");



        }catch (SQLException e){


            setStatus(false);
        }

        return connection;

    }
    public void cek(){
        boolean p = getStatus();
        if(p == false){
            JOptionPane.showMessageDialog(this, "Konektifitas Database Bermasalah");
        }

    }


}
