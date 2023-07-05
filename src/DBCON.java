
import java.sql.*;

public class DBCON {

    Connection con;
    DBCON() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionURL = "jdbc:mysql://localhost:3306/sampledb";
            
            String dbuser="root";
            String dbpass="root";
            con = DriverManager.getConnection(connectionURL,dbuser, dbpass);

            System.out.println("Successfully Connected .....");
        } catch (Exception e) {
            System.out.println("Connection failed ....." + e);
        }
    }

    public static void main(String args[]) {
        DBCON obj = new DBCON();
    }
}
