package model;

import java.sql.SQLException;
import java.sql.Statement;

public class daftarModel {

    private Boolean status;
    private Statement statement;
    private String username;
    private String password;
    private String email;
    private String nama;
    private String nomer;
    public  String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNomer(){
        return nomer;
    }
    public void setNomer(String nomer){
        this.nomer = nomer;
    }

    public Boolean proses()  {

        status = false;
        try{
            String query = ("INSERT INTO user (username,password,namaLengkap,email,noHp) VALUES ('"+getUsername()+"','"+getPassword()+"', '"+getNama()+"', '"+getEmail()+"', '"+getNomer()+"') ");
            DbConnection connection = new DbConnection();
            connection.DbConnection().createStatement().executeUpdate(query);
            status = true;
        }catch (SQLException e){
            status = false;
            e.printStackTrace();
        }

        return status;
    }

}
