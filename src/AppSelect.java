import java.sql.*;

public class AppSelect {
    public void SelectFunction(Statement statement) {
        // - SELECT * FROM users ; and execute
        String query = "SELECT * FROM survey";
        ResultSet resultSet;
        try {
            resultSet = statement.executeQuery(query);

            // - 결과 출력
            while (resultSet.next()) {
                // 각 컬럼의 데이터 타입을 잘 알아야 한다.
                String QUESTION_ID = resultSet.getString("QUESTION_ID");
                System.out.println("QUESTION_ID: " + QUESTION_ID);
                String ANSWER_ID = resultSet.getString("ANSWER_ID");
                System.out.println(" ANSWER_ID: " + ANSWER_ID);
                String USER_ID = resultSet.getString("USER_ID");
                System.out.println(" USER_ID: " + USER_ID);
              
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }
}
