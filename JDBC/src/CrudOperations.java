import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CrudOperations {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");

        // create connection
        String url = "jdbc:postgresql://localhost:5432/JDBCDb";
        String user = "sagar";
        String password = "0000";

        Connection con = DriverManager.getConnection(url, user, password);

        System.out.println("Connection Established");

        // create statement
        Statement st = con.createStatement();
        // String query = "insert into student values('5', 'Jhon', 48)";
        String query =  "update student set sname = 'Max' where sid = 5";

        String query1 = "delete from student where sid = 5";

        // this will return false with insert query
        // boolean status = st.execute(query);
        // System.out.println("Status is : " + status);

        //st.execute(query);
        st.execute(query1);

        // close the connection
        con.close();
        System.out.println("Connection is closed");
    }
}
