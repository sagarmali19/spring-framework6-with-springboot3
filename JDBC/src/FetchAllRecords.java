import java.sql.*;
public class FetchAllRecords {
    public static void main(String[] args) throws Exception{

        Class.forName("org.postgresql.Driver");

        // create connection
        String url = "jdbc:postgresql://localhost:5432/JDBCDb";
        String user = "sagar";
        String password = "0000";

        Connection con = DriverManager.getConnection(url, user, password);

        System.out.println("Connection Established");

        // create statement
        Statement st = con.createStatement();
        String query = "select * from student";

        // execute statement
        // executeQuery for fetching and execute for update operation
        ResultSet rs = st.executeQuery(query);

        // Process the result
        while(rs.next()){
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getInt(3));
            System.out.println();
        }

        // close the connection
        con.close();
        System.out.println("Connection closed");
    }
}
