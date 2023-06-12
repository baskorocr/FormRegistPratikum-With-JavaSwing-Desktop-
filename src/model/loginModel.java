package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class loginModel {

    private  boolean status;
    private Statement statement;

    private ResultSet resultSet;

        private String username;
        private String password;
        private String nama;
        private String email;
        private String noHp;

        public String id;


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

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

        public void setId(String id) {
            this.id = id;

        }

        public String getId() {

            return id;
        }

    public loginModel(){



    }


    public boolean getUser() {
        DbConnection connection = new DbConnection();
        connection.DbConnection();
        connection.cek();
        status = false;


        try {
            // Membuat prepared statement untuk menjalankan query
            String query = "SELECT username,password,id,namaLengkap,email,noHp FROM user WHERE username='"+getUsername()+"' AND password ='"+getPassword()+"'";
            statement = connection.DbConnection().createStatement();
            resultSet = statement.executeQuery(query);
            if(resultSet.wasNull()){
                status =false;
                return status;
            }
            else{
                String tempUser = null;
                String tempPass = null;

                while(resultSet.next()){
                    tempUser = resultSet.getString("username");
                    tempPass = resultSet.getString("password");
                    setId(resultSet.getString("id"));
                    setNama(resultSet.getString("namaLengkap"));
                    setEmail(resultSet.getString("email"));
                    setNoHp(resultSet.getString("noHp"));

                }
                if(tempUser == null){
                   return status = false;

                }
                else{
                    if(tempUser.equals(getUsername()) && tempPass.equals(getPassword())){
                        status = true;


                    }
                    else{
                        status = false;
                    }
                }
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            status = false;
            e.printStackTrace();

        }

        return status;
    }

    public List<String> data(){
            DbConnection connection = new DbConnection();

            List<String> p = new ArrayList<>();
            try{
                String query = "SELECT username,password,id,namaLengkap,email,noHp FROM user WHERE username='"+getUsername()+"' AND password ='"+getPassword()+"'";
                statement = connection.DbConnection().createStatement();
                resultSet = statement.executeQuery(query);
                if(!resultSet.wasNull()){
                    String tempUser,Id,tempPass,namaLengkap,email,noHp;
                    while(resultSet.next()){
                        tempUser = resultSet.getString("username");
                        tempPass = resultSet.getString("password");
                        Id = resultSet.getString("id");
                        namaLengkap = resultSet.getString("namaLengkap");

                        email = resultSet.getString("email");
                        noHp = resultSet.getString("noHp");
                        p.add(Id);
                        p.add(namaLengkap);
                        p.add(tempUser);
                        p.add(tempPass);
                        p.add(email);
                        p.add(noHp);

                    }



                }
            }catch (SQLException e){
                e.printStackTrace();
            }
            return p;

    }

    public boolean editInput(){
        DbConnection connection = new DbConnection();
        status = false;
        try{
            String query = "UPDATE user SET NamaLengkap = '"+getNama()+"', email='"+getEmail()+"', noHp='"+getNoHp()+"' WHERE id='"+getId()+"'";
            statement = connection.DbConnection().createStatement();
            connection.DbConnection().createStatement().executeUpdate(query);
            status = true;
        }catch (SQLException e){
            e.printStackTrace();
            status = false;
        }

        return status;
    }

    public ResultSet dataPeserta(){
        DbConnection connection = new DbConnection();
        List<String> p = new ArrayList<>();
        try{
            String query = "SELECT id,namaLengkap FROM user";
            statement = connection.DbConnection().createStatement();
            resultSet = statement.executeQuery(query);


//            if(!resultSet.wasNull()){
//                String id ,nama ;
//                while(resultSet.next()){
//                    id = resultSet.getString("id");
//                    nama = resultSet.getString("namaLengkap");
//
//                    p.add(id);
//                    p.add(nama);
//                }
//
//
//            }
        }catch (SQLException e){
            e.printStackTrace();
        }
//        return p;
        return resultSet;
    }


}
