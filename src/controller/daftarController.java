package controller;

import model.DbConnection;
import model.daftarModel;
import view.daftar;
import view.login;


import javax.swing.*;
import java.sql.SQLException;

public class daftarController {
    private daftar view;
    private daftarModel model;
    private Boolean result;


    public  daftarController(daftar view) {
        this.view = view;
        model = new daftarModel();

    }
    public void proses(){
        DbConnection connection = new DbConnection();
        connection.DbConnection();
        connection.cek();
        String username = view.username.getText();
        String password = view.password.getText();
        String nama = view.nama.getText();
        String email = view.email.getText();
        String nomer = view.telp.getText();
        String konfirmasi = view.konfirmasi.getText();

       if(connection.getStatus() == true){
           if(username.isEmpty() || password.isEmpty() || nama.isEmpty() || email.isEmpty() || nomer.isEmpty() || konfirmasi.isEmpty() ){

               JOptionPane.showMessageDialog(view, "Semuanya wajib diisi");

           }
           else{

               if(!password.equals(konfirmasi)){
                   JOptionPane.showMessageDialog(view, "konfirmasi password tidak sama!");
               }
               else{
                   model.setUsername(username);
                   model.setPassword(password);
                   model.setNama(nama);
                   model.setNomer(nomer);
                   model.setEmail(email);

                   result = model.proses();
                   if(result){
                       JOptionPane.showMessageDialog(view, "Pendaftaran Berhasil");
                       login lgn = new login();
                       lgn.setVisible(true);
                       view.dispose();
                   }

               }

           }

       }

    }

}
