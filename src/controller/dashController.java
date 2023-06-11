package controller;

import model.loginModel;
import view.dashboard;

import javax.swing.*;

public class dashController extends JFrame {
    private final dashboard view;
    private loginModel model;



    public dashController(loginModel model,dashboard view){
        this.view = view;
        this.model = model;

    }

    public void show(){

//        view.lbl1.setText(model.data().get(1));
        view.nama.setText(model.data().get(1));
        view.email.setText(model.data().get(4));
        view.hp.setText(model.data().get(5));
        view.username.setText(model.data().get(2));
        view.password.setText(model.data().get(3));



    }





}
