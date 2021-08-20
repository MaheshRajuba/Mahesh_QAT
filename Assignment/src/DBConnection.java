import java.sql.*;

public class DBConnection {

			public static void main(String[] args) throws ClassNotFoundException, SQLException {
				
				String url = "jdbc:oracle:thin:@localhost:1521/XE";
				String username = "SYSTEM";
				String password = "rajuba12";
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection(url,username,password);
				System.out.println("Connection created");
				Statement stmt = con.createStatement();
				
				//String insertValues = "INSERT INTO STUDENT (ID,NAME) VALUES (1,'RAJ')";
				//stmt.executeUpdate(insertValues);
				
				String updateData = "UPDATE STUDENT SET NAME ='MAHESH' WHERE ID = 3";
				stmt.executeUpdate(updateData);
				
				ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT");
				System.out.println("Query execution" + rs);
				
				while(rs.next()) {
					System.out.println(rs.getString("id") + " : " +  rs.getString("name")+ " : " +  rs.getString("dob") );
				}
				con.close();
				
				
			}
	}


