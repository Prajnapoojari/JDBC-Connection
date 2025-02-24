import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connection6 {
    public static void main(String[] args) throws Exception {
//        show the items in table
//        String sql="select * from Menu ";
//        insert the items in table
//        String sql="insert into Menu values(6,'Bajji','1 plate',150)";
//        delete the items in table
//        String sql="delete from Menu where sno=2";
//        update the items in table
        String sql="update Menu set Dname='Scoop Icecream' where Sno=5";
        String url="jdbc:mysql://localhost:3306/Hotel";
        String username="root";
        String password="Yashoda@77";
        Connection obj= DriverManager.getConnection(url,username,password);
        Statement obj1=obj.createStatement();
        int count =obj1.executeUpdate(sql);
//        System.out.println(count+" row inserted");
//        System.out.println(count+" row Deleted");
        System.out.println(count+" row Updated");
//        while(obj2.next()) {
//            String data = obj2.getInt(1) + ":" + obj2.getString(2);
//            System.out.println(data);
//        }



    }
}

