import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connection2 {
    public static void main(String[] args) throws Exception {
        String sql="select * from student";
        String url="jdbc:mysql://localhost:3306/Maravnthe";
        String username="root";
        String password="Yashoda@77";
        Connection obj1= DriverManager.getConnection(url,username,password);
        Statement obj2=obj1.createStatement();
        ResultSet obj3=obj2.executeQuery(sql);
       while(obj3.next()) {
           String data = obj3.getInt(1) + ":" + obj3.getString(2);
           System.out.println(data);
       }
//       insted of calling repetedly we can use while loop
//        obj3.next();
//        String data2= obj3.getInt(1)+":"+obj3.getString(2);
//        System.out.println(data2);
//        obj3.next();
//        String data3= obj3.getInt(1)+":"+obj3.getString(2);
//        System.out.println(data3);
    }
}

