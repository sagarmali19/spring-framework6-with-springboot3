// import pacakges
import java.sql.*;
public class DemoJDBC {
    public static void main(String[] args) throws Exception {
        /*
        Import packages
        Load and register
        Create connection
        Create statement
        Execute statement
        Process the result
        Close
         */

        // Load the driver
        Class.forName("org.postgresql.Driver");

        // create connection
        String url = "jdbc:postgresql://localhost:5432/JDBCDb";
        String user = "sagar";
        String password = "0000";

        Connection con = DriverManager.getConnection(url, user, password);

        System.out.println("Connection Established");

        // create statement
        Statement st = con.createStatement();
        String query = "select sname from student where sid = '1'";

        // execute statement
        // executeQuery for fetching and execute for update operation
        ResultSet rs = st.executeQuery(query);

        // Process the result
        //System.out.println(rs.next()); // this returns true or false
        rs.next();
        String name = rs.getString("sname");
        System.out.println("Name of student name is :" + name);

        // close the connection
        con.close();
        System.out.println("Connection closed");

    }
}
