import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DB_Connect {
    public static String url = "jdbc:postgresql://localhost:5432/air-sql";
    private static Connection conn;
    private static String user = "panth";//Username of database
    private static String passwd = "1892";//Password od Database
    

    public static Connection connect() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException cnfe) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        conn = DriverManager.getConnection(url, user, passwd);
        JOptionPane.showMessageDialog(null, "Connected");
        return conn;
    }

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        if (conn != null && !conn.isClosed())
            return conn;
        connect();
        return conn;
    }
}