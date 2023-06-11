package view;




import controller.dashController;
import model.loginModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dashboard extends JFrame {
    private JPanel about;
    private JButton listPesertaButton;
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
        controller = new dashController(model,this);
        controller.show();
        setTitle("about");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        java.net.URL imgurl = getClass().getResource("Image/rr.png");
        ImageIcon icon = new ImageIcon(imgurl);

        Image tempImg = icon.getImage();
        Image resize = tempImg.getScaledInstance(110,110, Image.SCALE_SMOOTH);
        ImageIcon icon1 = new ImageIcon(resize);
        photo.setIcon(icon1);
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
                new peserta();
            }
        });
    }








}
