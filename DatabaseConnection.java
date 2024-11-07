import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/users";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    public static void main(String[] args) {
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Koneksi ke database berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal!");
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Koneksi ditutup.");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
