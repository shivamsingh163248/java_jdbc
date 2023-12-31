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

            // now set the value in value
            preparedStatement.setString(1 , CrudOpration.getFist_name());
            preparedStatement.setString(2, CrudOpration.getLast_name());
            preparedStatement.setString(3,CrudOpration.getEmail());
            preparedStatement.setString(4,CrudOpration.getGender());
            preparedStatement.setString(5,CrudOpration.getGetMobile_number());

            // now excution of the quer
            int resultset = preparedStatement.executeUpdate() ;

            // now creatin the condition for the successful and unsuccessful
            if (resultset>0){
                System.out.println("now successful inserted ");
            }else{
                System.out.println("unsuccful inserted");
            }





        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    // now creating the new method
    public void deletedUserDetail(String url , String username , String password){

        // now creating the connection
        try {
            Connection connection = DriverManager.getConnection(url,username,password) ;
            // now creating the query
            // and creatng the pripaird statement
            String query = "DELETE FROM student WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query) ;
            // now set the value in the pripared statement
            preparedStatement.setInt(1,CrudOpration.deleteOpration());
            // now execute the value
            int roweffect = preparedStatement.executeUpdate();

            // now creating the update function and creating the condition
            if (roweffect > 0){
                System.out.println("your updatation is the successful");
            }else{
            System.out.println("oops unsuccessful !!!!! ");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }





}
