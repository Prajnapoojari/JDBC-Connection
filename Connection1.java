import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;   //import package, load and rigister, conncetion, createstatment, execution, close.

public class Connection1 {
    public static void main(String[] args) throws Exception {
        String sql="select name from student where id=3";

        String url="jdbc:mysql://localhost:3306/Maravnthe";
        String username="root";
        String password="Yashoda@77";
        Connection obj1= DriverManager.getConnection(url,username,password);
        Statement obj2=obj1.createStatement();
        ResultSet obj3=obj2.executeQuery(sql);
        obj3.next();
       String name= obj3.getString(1);
       System.out.println(name);
    }
}
