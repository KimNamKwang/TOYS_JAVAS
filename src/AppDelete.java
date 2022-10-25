import java.sql.Statement;
import java.util.Scanner;

public class AppDelete {
    public void DeleteFunction(Statement statement) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        // 커맨드 받기.
        System.out.println("이름을 입력해주세요 :" + input + "\n" + "비밀번호를 입력해주세요 :" + input);
        String query = "DELETE FROM survey WHERE USER_ID IN (SELECT USER_ID FROM user WHERE NAME = " + input + "AND password =" + input + ");" ;
        //Scanner로 입력받은 USER_NAME과 USER_ID를 어떻게 엮을지 고민.-> 했으나 극뽁-! ->한 줄 알았는데 FAIL
       
        try {
            statement.executeQuery(query);
    
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        
    }
    
}
