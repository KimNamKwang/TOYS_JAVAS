import java.sql.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input :");
        String input = sc.next();
        // Done - MySQL workbench 실행 : JDBC
        // - User/password와 접속 IP:port(localhost:3306) 접속
        String url = "jdbc:mysql://localhost:3306/study_sqls";
        // 라이브러리 방식:제품명://IP:PORT/폴더명
        String user = "root";
        String password = "*khacademy!";

        // - database지정
        try {

            Connection connection = DriverManager.getConnection(url, user, password);

            // editor창을 만든것
            Statement statement = connection.createStatement();

            // - SELECT * FROM users ; and execute
            String query = "SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(query);

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

            // insert into
            // query = "INSERT INTO users(UNIQUE_ID, NAME, EMAIL, JOB)" +
            //         " VALUE ('U6', 'namkwang', 'namkwang@gmail.com', 'IT Billing')";
            // statement.execute(query);

            // Update 
            query = "update users SET NAME = 'Nam'";
            statement.execute(query);

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
