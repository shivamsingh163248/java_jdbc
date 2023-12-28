// importing the sql libreries
import java.sql.*;



public class Main {

     private static final  String url = "jdbc:mysql://localhost:3307/test";
     private static   String username = "root" ;
     private static   String password = "root";

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

            while (resultSet.next()){

                // now finding the result form the data base
                int id = resultSet.getInt("id") ;
                String frist_name = resultSet.getNString("first_name") ;
                String last_name = resultSet.getNString("last_name") ;
                String email = resultSet.getNString("email") ;
                String gender = resultSet.getNString("gender");
                String mobile_no = resultSet.getNString("mobile_no") ;

                // now printing the data in the font
                System.out.println("hello mr . "+frist_name+" "+last_name);
                System.out.println("yout contect info is "+email+" mobile mo"+mobile_no);
                System.out.println("your gender is "+gender);
                System.out.println("-----------------------------------------------------------------------------");

            }




        }catch (SQLException e){
            System.out.println(e.getMessage());
        }



        // now u[date the deta and the delete the data from the data base

        // creating the try statement

        // creating the obejct of the take input
        userInput detail = new userInput() ;
       Detail filldetail = detail.inputStore() ;



        try {
            Connection connection = DriverManager.getConnection(url , username , password) ;
            Statement statement = connection.createStatement() ;
            String quey = String.format("INSERT INTO STUDENT(first_name , last_name , email , gender , mobile_no)VALUES( '%s','%s','%s','%s','%s')" , filldetail.getFist_name() , filldetail.getLast_name() , filldetail.getEmail() , filldetail.getGender() , filldetail.getMobile_number() );

            // now creating the excument
            int rowAffect  = statement.executeUpdate(quey) ;

            // now printing the message
            if (rowAffect > 0){
                System.out.println("data inserted successful ! ");
            }else {
                System.out.println("Data not inserted");
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
