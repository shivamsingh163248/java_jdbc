import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.PrimitiveIterator;

public class InsurtedDataUsingBatchProcessing {

    // now creating the method and used the batch processing system

    public void InsertUsingBatchProcessing( String url , String username , String password){

        // creating the connection after the loading the drive manager
        // we are the writing the connection in the  try block\
        Detail crudOpration = new Detail() ;

        try {
            Connection connection = DriverManager.getConnection(url , username , password) ;
            //after the making the connection creating the query for the  pri paired statement
            String query = "INSERT INTO STUDENT(first_name , last_name , email , gender , mobile_no)VALUES(?,?,?,?,?)";
            // after they are insert creating the statement
            PreparedStatement preparedStatement = connection.prepareStatement(query) ;

            // now set the value using the batch process  system
            // creating the while loop
            while (true){
                crudOpration.takeinput();
                // now set the data
                preparedStatement.setString(1, crudOpration.getFist_name());
                preparedStatement.setString(2, crudOpration.getLast_name());
                preparedStatement.setString(3, crudOpration.getEmail());
                preparedStatement.setString(4, crudOpration.getGender());
                preparedStatement.setString(5, crudOpration.getMobile_number());

                // user display
                System.out.println("do you want insert again data replay (Y/N)");


            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


}
