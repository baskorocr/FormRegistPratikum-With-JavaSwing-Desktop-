package view;




import controller.dashController;
import model.loginModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class dashboard extends JFrame {
    private JPanel about;
    public JButton listPesertaButton;
    private JButton editDataButton;
    private JButton logoutButton;
    public JLabel nama;
    public JLabel email;
    public JLabel hp;
    public JLabel username;
    public JLabel password;
    private JLabel photo;


    private dashController controller;


    public dashboard(loginModel model){

        setVisible(true);
        controller = new dashController(model,this);
        controller.show();
        setTitle("Dashboard");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setContentPane(about);
        setSize(600, 500);
        setResizable(false);
        setLocationRelativeTo(null);


        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new login();
                dispose();

            }
        });
        listPesertaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new peserta(model);
            }
        });
        editDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new edit(model);
                dispose();

            }
        });
    }








}
