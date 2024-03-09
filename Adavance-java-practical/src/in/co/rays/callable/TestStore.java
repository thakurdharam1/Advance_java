package in.co.rays.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class TestStore {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adavance_java", "root", "root");

		CallableStatement callStmt = conn.prepareCall("{? = CALL square(?)}");
		callStmt.setInt(2, 5);
		callStmt.registerOutParameter(1, Types.INTEGER);
		callStmt.execute();

		System.out.println(" Square " + callStmt.getInt(1));
	}


}
