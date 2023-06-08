package model;

import java.sql.*;


public class loginModel {

    private  boolean status;
    private Statement statement;

    private ResultSet resultSet;






        private String username;
        private String password;



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


    public loginModel(){



    }

    public boolean getUser() {
        DbConnection connection = new DbConnection();
        status = false;
        System.out.println(getPassword());
        try {
            // Membuat prepared statement untuk menjalankan query
            String query = "SELECT username,password FROM user WHERE username='"+getUsername()+"' AND password ='"+getPassword()+"'";
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
}
