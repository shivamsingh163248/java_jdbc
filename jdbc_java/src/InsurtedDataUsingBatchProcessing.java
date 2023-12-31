import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Scanner;

public class InsurtedDataUsingBatchProcessing {


    public  void insertUsingBatch(String url , String username , String passward){

        // fist we are the connection
        // now creating the try catch block for the handel the exception
        //connection take input username and password and the url

        try {
            Connection connection = DriverManager.getConnection(url , username , passward) ;
            String query = "INSERT INTO STUDENT(first_name , last_name , email , gender , mobile_no)VALUES(?,?,?,?,?)" ;
            // now creating the prepaired  the statement
            PreparedStatement preparedStatement = connection.prepareStatement(query) ;


            while (true) {

                // now set the value in value
                 Detail CrudOpration = new Detail() ;
                 CrudOpration.takeinput();

                preparedStatement.setString(1, CrudOpration.getFist_name());
                preparedStatement.setString(2, CrudOpration.getLast_name());
                preparedStatement.setString(3, CrudOpration.getEmail());
                preparedStatement.setString(4, CrudOpration.getGender());
                preparedStatement.setString(5, CrudOpration.getMobile_number());

                // now excution of the quer

                preparedStatement.addBatch();

                // now creating for the loop termination
                Scanner input = new Scanner(System.in) ;
                System.out.println("if you wan insert agin the insurt no Y/N");
                String value = input.next() ;
                if(value.toUpperCase().equals("Y")){
                    break;
                }
            }




            int[]resultset = preparedStatement.executeBatch() ;

            // now creatin the condition for the successful and unsuccessful
          // now printing the whole array
            for (int i = 0; i < resultset.length; i++) {
                if (resultset[i] > 0) {
                    System.out.println(resultset[i] + "successful");
                } else {
                    System.out.println(resultset[i] + " Opps Uuccessful");
                }

            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }




}
