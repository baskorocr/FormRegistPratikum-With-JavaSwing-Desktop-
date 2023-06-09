package controller;

import view.dashboard;

public class dashboardController {
    private final dashboard view;
    public dashboardController(dashboard view){

        this.view = view;
    }

    public void hello(){
        view.setlabel("hallo");

    }
}
