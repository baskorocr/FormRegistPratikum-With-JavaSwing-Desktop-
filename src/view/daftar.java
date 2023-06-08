package view;

import javax.swing.*;

public class daftar extends JFrame {

    private JPanel Panel;
    private JTextField nama;
    private JTextField email;
    private JTextField telp;
    private JTextField username;
    private JTextField password;
    private JLabel judul;
    private JTextField konfirmasi;
    private JLabel Lblemail;
    private JLabel Lbltelp;
    private JLabel Lblusername;
    private JLabel Lblpassword;
    private JLabel z;
    private JButton daftar;
    private JButton kembali;

    public daftar(){
        setContentPane(Panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        daftar daftar = new daftar();
        daftar.setVisible(true);

    }
}
