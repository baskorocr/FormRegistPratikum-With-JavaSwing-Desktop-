package controller;

import model.loginModel;
import view.edit;

public class editController {
    private edit view;
    private loginModel model;
    public editController(loginModel model, edit view){
        this.view = view;
        this.model = model;
        EditView();

    }

    public void EditView(){
        System.out.println(model.getUsername());

    }
}
