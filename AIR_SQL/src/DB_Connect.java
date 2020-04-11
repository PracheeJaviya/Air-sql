import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DB_Connect {
    public static String url = "jdbc:postgresql://localhost:5432/air-sql";
    private static Connection conn;
    private static String user = "panth";//Username of database
    private static String passwd = "panth";//Password od Database


    public static Connection connect() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException cnfe) {
            System.err.println("Error: " + cnfe.getMessage());
        }
        conn = DriverManager.getConnection(url, user, passwd);
        //  System.out.println(url);
        return conn;
    }

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        if (conn != null && !conn.isClosed())
            return conn;
        connect();
        return conn;
    }
}