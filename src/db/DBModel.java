//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBModel {
    public DBModel() {
//
    }

    public static void main(String[] args) {
//        insert("test", 999,"test", "test.png");
//        insert("test", 999,"test", "test.png");
//        insert("test", 999,"test", "test.png");
//        insert("test", 999,"test", "test.png");
//        insert("test", 999,"test", "test.png");
        query();
    }
//    public static void update(int id, String product, int price, String img) {
//        String sql = "UPDATE products SET product = ?, price = ?,img = ? WHERE id = ?";
//
//        try {
//            PreparedStatement pstmt = Connection.connection().prepareStatement(sql);
//            pstmt.setString(4, String.valueOf(id));
//            pstmt.setString(1, product);
//            pstmt.setString(2, String.valueOf(price));
//            pstmt.setString(3, img);
//            pstmt.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }

    public static void delete(int id) {
        String sql = "DELETE FROM products WHERE id=?";

        try {
            PreparedStatement pstmt = Connection.connection().prepareStatement(sql);
            pstmt.setString(1, String.valueOf(id));
            pstmt.executeUpdate();
        } catch (SQLException var3) {
            var3.printStackTrace();
        }

    }

    public static void insert(String product, int price,String category, String img) {
        String sql = "INSERT INTO products(product,price,category,image) values(?,?,?,?);";

        try {
            PreparedStatement pstmt = Connection.connection().prepareStatement(sql);
            pstmt.setString(1, product);
            pstmt.setString(2, String.valueOf(price));
            pstmt.setString(3, category);
            pstmt.setString(4, img);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void query() {
        try {
            String sql = "SELECT * FROM products";
            Statement statement = Connection.connection().createStatement();
            ResultSet result = statement.executeQuery(sql);

            while(result.next()) {
                String id = result.getString("id");
                String product = result.getString("product");
                String price = result.getString("price");
                String category = result.getString("category");
                String img = result.getString("image");
                System.out.println(id + " | " + product + "  |  "+ price + "  |  "+ category + "  |  " + img);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
