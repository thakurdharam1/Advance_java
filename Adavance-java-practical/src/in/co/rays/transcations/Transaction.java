package in.co.rays.transcations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Transaction {
	public static void main(String[] args) throws Exception {
		Connection conn=null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicals", "root", "root");
			Statement stmt = conn.createStatement();
			conn.setAutoCommit(false);
			int i = stmt.executeUpdate("insert into marksheet values(23, 119, 'xyz', 98, 76, 66)");
			i = stmt.executeUpdate("insert into marksheet values(24, 120, 'xyz', 98, 76, 66)");
			i = stmt.executeUpdate("insert into marksheet values(23, 121, 'xyz', 98, 76, 66)");

			conn.commit();
			System.out.println("inserted  " + i);

		}catch(Exception e) {
			conn.rollback();
			System.out.println(e.getMessage());
			
		}finally {
			conn.close();
		}
	}
}
