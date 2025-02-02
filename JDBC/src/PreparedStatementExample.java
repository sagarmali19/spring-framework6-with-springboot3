import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementExample {
    public static void main(String[] args) throws Exception{
        Class.forName("org.postgresql.Driver");

        // create connection
        String url = "jdbc:postgresql://localhost:5432/JDBCDb";
        String user = "sagar";
        String password = "0000";

        Connection con = DriverManager.getConnection(url, user, password);

        System.out.println("Connection Established");

        int sid = 101;
        String sname = "Jayashri";
        int marks = 48;
        String sql = "insert into student values(?, ?, ?)";

        // prepared statement
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);
        st.execute();

        // close the connection
        con.close();
        System.out.println("Connection is closed");
    }
}
