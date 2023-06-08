package controller;

import view.dashboard;

public class aboutController {
    private final dashboard view;
    public aboutController(dashboard view){

        this.view = view;
    }

    public void hello(){
        view.setlabel("hallo");

    }
}
