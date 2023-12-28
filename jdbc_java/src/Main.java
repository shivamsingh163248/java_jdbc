// importing the sql libreries
import java.sql.*;



public class Main {

     private static final  String url = "jdbc:mysql://localhost:3307/?user=root";
     private static   String username = "root" ;
     private static   String password = "";

    public static void main(String[] args) {

        // creating the function using the class for name
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch( ClassNotFoundException e){
            System.out.println(e.getMessage());
        }


        // now creating the connection between the deta base

        try {
            Connection connection = DriverManager.getConnection(url , username , password);
            Statement statement = connection.createStatement();
            String quary  = "select * from student" ;
            ResultSet  resultSet = statement.executeQuery(quary) ;

            // now creating the while loop for the retrive deta from the data base




        }catch (SQLException e){
            System.out.println(e.getMessage());
        }




    }
}
