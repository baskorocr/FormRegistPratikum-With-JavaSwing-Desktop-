package controller;
import model.loginModel;
import view.dashboard;
import view.login;

import javax.swing.JOptionPane;
import javax.swing.*;


public class loginController extends JFrame {

    private login view;
    private loginModel model;

    private Boolean result;
    private dashboard ds;



    public loginController(login view){
        this.view = view;
        model = new loginModel();

    }

    public void prosessLogin(){
        String username = view.textField1.getText();
        String password = view.textField2.getText();

        model.setUsername(username);
        model.setPassword(password);

        result = model.getUser();

        if(result){
            dashboard abt = new dashboard(model);
            view.dispose();
            abt.setVisible(true);

        }
        else{
            JOptionPane.showMessageDialog(view, "Periksa Username dan Password anda");
        }

    }
}
