// importing the sql libreries

import java.sql.*;
import java.util.Calendar;
import java.util.Scanner;


public class Main {

    private static final String url = "jdbc:mysql://localhost:3307/test";
    private static String username = "root";
    private static String password = "root";

    public static void main(String[] args) {

        // creating the function using the class for name
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }


        // now creating the connection between the deta base

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String quary = "select * from student";
            ResultSet resultSet = statement.executeQuery(quary);

            // now creating the while loop for the retrive deta from the data base

            while (resultSet.next()) {

                // now finding the result form the data base
                int id = resultSet.getInt("id");
                String frist_name = resultSet.getNString("first_name");
                String last_name = resultSet.getNString("last_name");
                String email = resultSet.getNString("email");
                String gender = resultSet.getNString("gender");
                String mobile_no = resultSet.getNString("mobile_no");

                // now printing the data in the font
                System.out.println("hello mr . " + frist_name + " " + last_name);
                System.out.println("yout contect info is " + email + " mobile mo" + mobile_no);
                System.out.println("your gender is " + gender);
                System.out.println("-----------------------------------------------------------------------------");

            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


        // now u[date the deta and the delete the data from the data base

        // creating the try statement

        // creating the obejct of the take input

        Detail filldetail = new Detail();
        filldetail.takeinput();


        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String quey = String.format("INSERT INTO STUDENT(first_name , last_name , email , gender , mobile_no)VALUES( '%s','%s','%s','%s','%s')", filldetail.getFist_name(), filldetail.getLast_name(), filldetail.getEmail(), filldetail.getGender(), filldetail.getMobile_number());

            // now creating the excument
            int rowAffect = statement.executeUpdate(quey);

            // now printing the message
            if (rowAffect > 0) {
                System.out.println("data inserted successful ! ");
            } else {
                System.out.println("Data not inserted");
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        // creating the update operation

        // creating the try block for the hendal the exception
        // now creating the object
       String updatestring =  filldetail.updateInformation();
        String newupdatevalue = filldetail.updatevalue(updatestring);
        System.out.println(updatestring+" "+newupdatevalue);
        Scanner input = new Scanner(System.in) ;
        System.out.println("enter your id ");
        int id = input.nextInt() ;


        try {

            // frist lode the driver using the class for name
            // now creating the connection
            Connection connection = DriverManager.getConnection(url , username , password) ;
            // creating the statement line
            Statement statement = connection.createStatement() ;
            // now creating the query
            String query = String.format("UPDATE  STUDENT SET %s = '%s' WHERE id = %d " , updatestring, newupdatevalue,id) ;
            // now excuation of the query
            int rowaffected = statement.executeUpdate(query) ;

            // now creating the condtion
            if (rowaffected >0){
                System.out.println("successful data update !!!");
            }else{
                System.out.println("oops !!! no unsuccessful ");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
