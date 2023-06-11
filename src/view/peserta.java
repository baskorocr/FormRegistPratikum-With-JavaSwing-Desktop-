package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class peserta extends JFrame {
    private JTable table;
    private JPanel panel;
    private JScrollPane SP;
    private JLabel lblPeserta;
    private DefaultTableModel model;

    public peserta(){
        String[] columnNames = {"Nama", "Usia", "Kota"};
        Object[][] data = {
                {"John", 25, "New York"},
                {"Jane", 30, "London"},
                {"Bob", 40, "Paris"}
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Buat JTable menggunakan model
        table = new JTable(model);

        // Buat JScrollPane dan tambahkan JTable ke dalamnya
        JScrollPane scrollPane = new JScrollPane(table);

        // Buat JPanel dan set layout
        JButton kembali = new JButton();

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JLabel label = new JLabel("Data Pengguna");



        // Buat JLabel

        panel.add(kembali,BorderLayout.NORTH);
        // Tambahkan JLabel ke dalam JPanel di bagian atas (North)
        panel.add(label, BorderLayout.NORTH);
        panel.setBorder(new EmptyBorder(5,10,50,10));
        // Tambahkan JScrollPane ke dalam JPanel di bagian tengah (Center)
        scrollPane.setBorder(new EmptyBorder(20,0,0,0));
        panel.add(scrollPane, BorderLayout.CENTER);
        setSize(600, 500);

        // Set content pane dengan JPanel
        setContentPane(panel);






        setVisible(true);
        setTitle("login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);



        setLocationRelativeTo(null);

    }


}
