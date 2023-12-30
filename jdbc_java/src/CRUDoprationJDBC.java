import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CRUDoprationJDBC {

    // creating the function
    // takeinput function

    // now creating the object for the insuting the value
    Detail CrudOpration  = new Detail() ;

    public  void insurtopration(String url , String username , String passward){

        // fist we are the connection
        // now creating the try catch block for the handel the exception
        //connection take input username and password and the url

        try {
            Connection connection = DriverManager.getConnection(url , username , passward) ;
            String query = "INSERT INTO STUDENT(first_name , last_name , email , gender , mobile_no)VALUES(?,?,?,?,?)" ;
            // now creating the prepaired  the statement
            PreparedStatement preparedStatement = connection.prepareStatement(query) ;


            CrudOpration.takeinput();




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
