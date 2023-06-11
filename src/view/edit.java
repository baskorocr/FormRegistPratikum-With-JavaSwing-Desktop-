package view;

import controller.editController;
import model.loginModel;
public class edit {
    private editController controller;

    public edit(loginModel model){
         new editController(model,this);

    }
}
