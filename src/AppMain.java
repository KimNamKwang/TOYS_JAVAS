import java.sql.*;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :");
        String input = scanner.next();

        // Done - MySQL workbench 실행 : JDBC
        // - User/password와 접속 IP:port(localhost:3306) 접속
        String url = "jdbc:mysql://localhost:3306/health_club"; //study_sqls
        // 라이브러리 방식:제품명://IP:PORT/폴더명
        String user = "root";
        String password = "ghost0916!";

        // - database지정
        try {

            Connection connection = DriverManager.getConnection(url, user, password);

            // editor창을 만든것
            Statement statement = connection.createStatement();

           //select statement
           AppSelect appSelect = new AppSelect();
           appSelect.SelectFunction(statement);

           // insert into
            AppInsert appInsert = new AppInsert();
            appInsert.InsertFunction(statement);

            // Update 
           AppUpdate appUpdate = new AppUpdate();
           appUpdate.UpdateFunction(statement);

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
