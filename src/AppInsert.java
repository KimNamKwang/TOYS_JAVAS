import java.sql.*;

public class AppInsert {
    public void InsertFunction(Statement statement) {
        try {
            String query = "INSERT INTO user(UNIQUE_ID, NAME, EMAIL, JOB)" +
                    " VALUE ('U8', 'namkwang', 'namkwang@gmail.com', 'IT Billing')";
            statement.execute(query);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
