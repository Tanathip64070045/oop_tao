package GUI;

import db.Connection;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    private JFrame app;
    private JPanel panel;
    public Test() throws SQLException {
        app = new JFrame("Taonyoi");
//        @param panel

        panel = new JPanel();
        String sql = "SELECT * FROM products";
        Statement statement = Connection.connection().createStatement();
        ResultSet result = statement.executeQuery(sql);

        while(result.next()) {
            String product = result.getString("product");
            String price = result.getString("price");

            JLabel lbl_name = new JLabel(product);
            JLabel lbl_price = new JLabel(price);
            panel.add(lbl_name);
            panel.add(lbl_price);
        }

        app.add(panel);
        app.setVisible(true);
        app.setSize(700,800);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws SQLException {
        new Test();
    }
}
