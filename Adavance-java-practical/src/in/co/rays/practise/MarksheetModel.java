package in.co.rays.practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class MarksheetModel {
	public  Integer  nextPk() throws Exception {
		int pk=0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement ps=conn.prepareStatement("select max(id) from marksheet");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
         pk= rs.getInt(1);
		}
		return pk+1;
		
		
	}
	
	public void add(MarksheetBean bean) throws Exception {
		int pk=nextPk();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement ps=conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
		ps.setInt(1,pk);
		ps.setInt(2, bean.getRoll_no());
		ps.setString(3, bean.getName());
		ps.setInt(4, bean.getPhysics());
		ps.setInt(5, bean.getChemistry());
		ps.setInt(6, bean.getMaths());
		
		int i=ps.executeUpdate();
		System.out.println("inserted " +i);
		
		
		
		
	}

}
