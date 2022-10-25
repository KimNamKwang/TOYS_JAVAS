import java.sql.*;

public class AppUpdate {
    public void UpdateFunction(Statement statement) {
        String query = "update users SET NAME = 'NAMKWANG'";
        try {
            statement.execute(query);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
