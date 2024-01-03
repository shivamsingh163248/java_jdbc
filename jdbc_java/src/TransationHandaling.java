import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransationHandaling {


    // now creating the function of the transation handaling

    public void transation (Connection connection){

        // noww creating the query
        String Depited = "UPDATE  ACCOUNT SET balance = balance - ? WHERE account_number = ?" ;
        String credited = "UPDATE  ACCOUNT SET balance = balance + ? WHERE account_number = ?";

        // now creating the pri paired statement
        try {
            PreparedStatement debitpPreparedStatement = connection.prepareStatement(Depited) ;
            PreparedStatement creditPreparedStatement = connection.prepareStatement(credited) ;

            // creating the set the number
            debitpPreparedStatement.setInt(1,100);
            debitpPreparedStatement.setInt(2,101);
            creditPreparedStatement.setInt(1,100);
            creditPreparedStatement.setInt(2,102);

            // now excution the statement

            int debit = debitpPreparedStatement.executeUpdate();
            int credite = creditPreparedStatement.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
