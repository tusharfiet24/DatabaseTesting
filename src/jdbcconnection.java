import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host = "localhost";
		String port = "3306";

		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/demo", "root", "admin");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from credentials where scenario = 'zerobalancecard'");
		
		while(rs.next()) {
			System.out.println("Username: " + rs.getString("username"));
			System.out.println("Password: " + rs.getString("password"));
		}
		
		con.close();
	}

}
