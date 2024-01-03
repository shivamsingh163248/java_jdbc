import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class transation {

    private static  final String url = "jdbc:mysql://localhost:3307/test " ;
    private static  String username  = "root";
    private static String passward  = "root";
    public static void main(String[] args) {

        // now loading the driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        // now creating the connection
        Connection connection;
        try {
            connection = DriverManager.getConnection(url, username, passward);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // now creating the object
        TransationHandaling check = new TransationHandaling();
        check.transation(connection);


    }
}
