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

        public String id;



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
        status = false;


        try {
            // Membuat prepared statement untuk menjalankan query
            String query = "SELECT username,password,id FROM user WHERE username='"+getUsername()+"' AND password ='"+getPassword()+"'";
            statement = connection.DbConnection().createStatement();
            resultSet = statement.executeQuery(query);
            if(resultSet.wasNull()){
                status =false;
                return status;
            }
            else{
                String tempUser = null;
                String tempPass = null;
                String Id = null;
                while(resultSet.next()){
                    tempUser = resultSet.getString("username");
                    tempPass = resultSet.getString("password");
                    Id = resultSet.getString("id");

                }
                if(tempUser == null){
                   return status = false;

                }
                else{
                    if(tempUser.equals(getUsername()) && tempPass.equals(getPassword())){
                        status = true;
                        id = Id;

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
}
