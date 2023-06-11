package controller;

import model.loginModel;
import view.dashboard;
import view.edit;

import javax.swing.*;

public class editController {
    private edit view;
    private loginModel model;
    public editController(loginModel model, edit view){
        this.view = view;
        this.model = model;
        EditView();

    }

    public void EditView(){
        view.nama.setText(model.getNama());
        view.email.setText(model.getEmail());
        view.hp.setText(model.getNoHp());


    }

    public void editProses(){
        model.setNama(view.nama.getText());
        model.setEmail(view.email.getText());
        model.setNoHp(view.hp.getText());

        boolean result = model.editInput();

        if(result){
            JOptionPane.showMessageDialog(view, "Update Data selesai");
            dashboard abt = new dashboard(model);
            view.dispose();
            abt.setVisible(true);

        }
        else{
            JOptionPane.showMessageDialog(view, "DB Bermasalah");
        }
    }
}
