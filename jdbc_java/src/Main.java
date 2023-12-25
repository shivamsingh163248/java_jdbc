// importing the sql libreries
import java.sql.*;



public class Main {



    public static void main(String[] args) {

        // creating the function using the class for name
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch( ClassNotFoundException e){
            System.out.println(e.getMessage());
        }



    }
}
