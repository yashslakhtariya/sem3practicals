package Hare_Krishna;
//import org.mariadb.jdbc.Driver;

import java.sql.*;

public class Demo
{
    public static void main(String... s)
    {
        try
        {
            String name = "Yash2";
            int ID = 16;
            String query = "insert into demo values(" + ID + ", " + "\"" + name + "\"" +")";
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/demo","demo","demo");
            Statement st = con.createStatement();
            int result = st.executeUpdate(query);
            System.out.println(result + " records affected");
            ResultSet rs = st.executeQuery("select * from demo");
            while (rs.next())
            {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " ");
            }
            con.close();

        }
        catch (Exception exc)
        {
            exc.printStackTrace();
        }
        System.out.println("Demo program");
    }
}
