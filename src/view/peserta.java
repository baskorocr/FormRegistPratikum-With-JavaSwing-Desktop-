package view;

import controller.listController;
import model.loginModel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class peserta extends JFrame {

    private JTable table;
    private JPanel panel;
    private JScrollPane SP;
    private JLabel lblPeserta;
    private DefaultTableModel model;



    public peserta(loginModel m){
        setVisible(true);
        listController ls =  new listController(m,this);
        JLabel titleLabel = new JLabel("List Data Peserta");
        titleLabel.setBorder(new EmptyBorder(20,0,20,0));
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(titleLabel, BorderLayout.NORTH);


        table = new JTable();

        ResultSet resultSet = ls.list();
        DefaultTableModel model = new DefaultTableModel();
        try {
            ResultSetMetaData metaData = resultSet.getMetaData();
            System.out.println(metaData);
            int columnCount = metaData.getColumnCount();
            System.out.println(columnCount);
            for (int column = 1; column <= columnCount; column++) {
                model.addColumn(metaData.getColumnName(column));
            }

            // Add row data to the model
            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int column = 1; column <= columnCount; column++) {
                    rowData[column - 1] = resultSet.getObject(column);
                }
                model.addRow(rowData);
            }

            // Set the table model
            table.setModel(model);
            table.setEnabled(false);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // Set content pane dengan JPanel
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(new EmptyBorder(0,20,0,20));
        add(scrollPane, BorderLayout.CENTER);

        setSize(600, 500);
        setLocationRelativeTo(null);

    }




}
