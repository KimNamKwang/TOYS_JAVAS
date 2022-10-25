import java.sql.*;

public class AppSelect {
    public void SelectFunction(Statement statement) {
        // - SELECT * FROM users ; and execute
        String query = "SELECT * FROM users";
        ResultSet resultSet;
        try {
            resultSet = statement.executeQuery(query);

            // - 결과 출력
            while (resultSet.next()) {
                // 각 컬럼의 데이터 타입을 잘 알아야 한다.
                String UNIQUE_ID = resultSet.getString("UNIQUE_ID");
                System.out.println("UNIQUE_ID: " + UNIQUE_ID);
                String NAME = resultSet.getString("NAME");
                System.out.println(" NAME: " + NAME);
                String EMAIL = resultSet.getString("EMAIL");
                System.out.println(" EMAIL: " + EMAIL);
                String JOB = resultSet.getString("JOB");
                System.out.println(" JOB: " + JOB);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }
}
