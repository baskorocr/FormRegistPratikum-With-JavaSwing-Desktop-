package view;

import controller.loginController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.loginModel;

public class login extends JFrame{
    private JButton login;
    public JTextField textField1;
    public JTextField textField2;

    private JPanel Panel;
    private JButton daftar;

    private loginController controller;


    public login() {
        this.setVisible(true);
        setTitle("login");
        controller = new loginController(this);
       setContentPane(Panel);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250,300);
        setResizable(false);
        setLocationRelativeTo(null);
    login.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            controller.prosessLogin();

        }
    });


        daftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               view.daftar daftar = new view.daftar();
                dispose();
                daftar.setVisible(true);

            }
        });
    }


}
