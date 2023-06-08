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
        controller = new loginController(this);
       setContentPane(Panel);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
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
                daftar.setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        login lgn = new login();
        lgn.setVisible(true);


    }
}
