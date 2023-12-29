import java.sql.*;
public class JdbcPriperdStatement {

    // now creating the varible
    private static  final String url = " " ;
    private static  String username  = " ";
    private static String passward  = " ";

    // now all the neccesary string are the required for the connection


    public static void main(String[] args) {

        // now lode the driver of the data base
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        // now creating the connection to the data base
        // now creating the try block for the creating the connection

        try {
            Connection connection = DriverManager.getConnection(url , username , passward) ;
            PreparedStatement 
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
