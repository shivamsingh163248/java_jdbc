import java.sql.*;
public class JdbcPriperdStatement {

    // now creating the varible
    private static  final String url = "jdbc:mysql://localhost:3307/test " ;
    private static  String username  = "root";
    private static String passward  = "root";

    // now all the neccesary string are the required for the connection

    // creating the method for the userinput

    public static void userinputmethod(){

        Detail userinput = new Detail() ;
        // now calling the object for the input

        userinput.takeinput();


        try {
            Connection connection = DriverManager.getConnection(url , username , passward) ;
            // now we are the writing the query for the dovelopement
            String query  = "INSERT INTO STUDENT(first_name , last_name , email , gender , mobile_no) VALUES(?,?,?,?,?)" ;

            PreparedStatement preparedStatement = connection.prepareStatement(query) ;

            // now the set the value in the pripaired statement
            preparedStatement.setString(1 ,userinput.getFist_name() );
            preparedStatement.setString(2,userinput.getLast_name());
            preparedStatement.setString(3,userinput.getEmail());
            preparedStatement.setString(4 ,userinput.getGender());
            preparedStatement.setString(5, userinput.getMobile_number());

            // now creating the statement for the excution
            // and find the row affect in these
            int rowaffect = preparedStatement.executeUpdate() ;
            // now creating the condition if row affect is the more then 0  its successful
            if (rowaffect > 0 ){
                System.out.println("successful inserted ");
            }else{
                System.out.println("unsuccessful !!!!!!!!!");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    public static void main(String[] args) {

        // now lode the driver of the data base
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

       // now direct callling the method
        userinputmethod();


    }
}
