package view;

import controller.editController;
import model.loginModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class edit extends JFrame {


    public JTextField nama;
    public JTextField email;
    public JTextField hp;
    private JButton updateButton;
    private JPanel Panel;
    private JButton kembaliButton;

    public edit(loginModel model){
        editController controller =  new editController(model,this);
         setVisible(true);
        setContentPane(Panel);
        setSize(300,450);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.editProses();
                dispose();
            }
        });
        kembaliButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new dashboard(model);
                dispose();
            }
        });
    }
}
