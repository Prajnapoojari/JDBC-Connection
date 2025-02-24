import java.sql.*;

public class Connection3 {
    public static void main(String[] args) throws Exception {
        int id=8;
        String name="Yashoda";
//        String sql = "insert into student values("+id+",'"+name+"')";
        String sql = "insert into student values(?,?)";
//        we can inserted the elemnt in another way
//        String sql = "insert into student values(6,'sud')";
        String url = "jdbc:mysql://localhost:3306/Maravnthe";
        String username = "root";
        String password = "Yashoda@77";
        Connection obj1 = DriverManager.getConnection(url, username, password);
//        we can inserted the elemnt in another way using prepared stament interfaces
        PreparedStatement st=obj1.prepareStatement(sql);
        st.setInt(1,id);
        st.setString(2,name);
//        Statement obj2 = obj1.createStatement();
        int count = st.executeUpdate();
        System.out.println(count+" row inserted");

        }
    }

