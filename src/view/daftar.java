package view;

import controller.daftarController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class daftar extends JFrame {

    private JPanel Panel;
   public JTextField nama;
    public JTextField email;
    public JTextField telp;
    public JTextField username;
    public JTextField password;
    private JLabel judul;
    public JTextField konfirmasi;
    private JLabel Lblemail;
    private JLabel Lbltelp;
    private JLabel Lblusername;
    private JLabel Lblpassword;
    private JLabel z;
    private JButton daftar;
    private JButton kembali;

    private daftarController controller;

    public daftar(){
        controller = new daftarController(this);
        this.setVisible(true);
        setContentPane(Panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,450);
        setResizable(false);
        setLocationRelativeTo(null);
        daftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.proses();
            }
        });
        kembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new login();
                dispose();

            }
        });
    }

}
