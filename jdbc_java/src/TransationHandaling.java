import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransationHandaling {

    public boolean Issufficent(Connection connection, int account_numbr , double balance) {

        // now making the query for the pri paired statement
        // query is in the format of the string
        String query = "select balance from account where account_number = ?";
        // now creating the statement
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query) ;
            // now set the value
            preparedStatement.setInt(1,account_numbr);

            // now getting the value int
            ResultSet resultSet = preparedStatement.executeQuery();
            // now input taking
            if (resultSet.next()){
                double amount = resultSet.getDouble("balance");
                // now compair
                System.out.println("balance : "+amount);
                if (amount < balance)
                    return false ;
            }else{
                return  true;
            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



        return true ;
    }



    // now creating the function of the transation handaling

    public void transation (Connection connection){

        // noww creating the query
        String Depited = "UPDATE  ACCOUNT SET balance = balance - ? WHERE account_number = ?" ;
        String credited = "UPDATE  ACCOUNT SET balance = balance + ? WHERE account_number = ?";

        // now creating the pri paired statement
        try {
            PreparedStatement debitpPreparedStatement = connection.prepareStatement(Depited) ;
            PreparedStatement creditPreparedStatement = connection.prepareStatement(credited) ;
            connection.setAutoCommit(false);

            // creating the set the number
            debitpPreparedStatement.setDouble(1,4);
            debitpPreparedStatement.setInt(2,101);
            creditPreparedStatement.setDouble(1,200);
            creditPreparedStatement.setInt(2,102);

            // now excution the statement
            int debit = debitpPreparedStatement.executeUpdate();
            int credite = creditPreparedStatement.executeUpdate();


            // now calling the function


            if (Issufficent(connection , 101 , 4)){
                connection.commit();
            }else{
                connection.rollback();
            }





        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
