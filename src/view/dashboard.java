package view;

import controller.dashboardController;


import javax.swing.*;

public class dashboard extends JFrame {
    private JPanel about;
    private JLabel lbl1;



    public dashboard(){
        setTitle("about");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setContentPane(about);
        setSize(200, 150);
        setResizable(false);
        dashboardController controller = new dashboardController(this);
        controller.hello();

    }

    public void setlabel(String text){
        lbl1.setText(text);

    }
    public static void main(String[] args) {
        new dashboard();




    }




}
