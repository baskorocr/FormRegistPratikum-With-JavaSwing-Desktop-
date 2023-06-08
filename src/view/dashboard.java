package view;

import controller.aboutController;


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
        aboutController controller = new aboutController(this);
        controller.hello();

    }

    public void setlabel(String text){
        lbl1.setText(text);

    }
    public static void main(String[] args) {
        new dashboard();




    }




}
