import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connection4 {
    public static void main(String[] args) throws Exception {
        String sql = "delete from student where id=7";
//       delete the row
        String url = "jdbc:mysql://localhost:3306/Maravnthe";
        String username = "root";
        String password = "Yashoda@77";
        Connection obj1 = DriverManager.getConnection(url, username, password);
        Statement obj2 = obj1.createStatement();
        int count = obj2.executeUpdate(sql);
        System.out.println(count + "row deleted");
    }
}
