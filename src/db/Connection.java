//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package db;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
//    @param db connect database;
    public static java.sql.Connection connection() {
        String url = "jdbc:sqlite:database.db";
        java.sql.Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("Error connecting to SQLite database");
            e.printStackTrace();
        }
        return conn;
    }
}
