package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDbManager {

    public static Connection ConnectionDb() {
        String url = "jdbc:mysql://localhost:3306/QLPhuongTienDB";
        String username = "root";
        String password = "12345";
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = java.sql.DriverManager.getConnection(url, username, password);
            System.out.println("Connection successfull.");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
