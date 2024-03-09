package in.co.rays.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DynamicPSTMTCrud {
	public static void main(String[] args) throws Exception {
		//testInsert(5,115,"aaa",76,87,90);
		//testUpdate("dharam",9);
		//testDelete(4);
		//testRead();
	}

	 private static void testRead() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicals", "root", "root");
		PreparedStatement ps=conn.prepareStatement("select *from marksheet");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getInt(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
			System.out.println(rs.getInt(5));
			System.out.println(rs.getInt(6));
			
		}
		
	}

	public static void testDelete(int id) throws Exception {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicals", "root", "root");
		 PreparedStatement ps=conn.prepareStatement("delete from marksheet where id=?");
		 ps.setInt(1, id);
		 int i=ps.executeUpdate();
		 System.out.println("record deleted");
	
		
	}

	public  static void testUpdate(String name,int id) throws Exception {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicals", "root", "root");
		 PreparedStatement ps=conn.prepareStatement("update marksheet set name = ? where id = ?");
		 ps.setString(1, name);
		 ps.setInt(2, id);
		
		 int i=ps.executeUpdate();
		 System.out.println("record updated");
		 
		 

			}

	public static void testInsert(int id,int rollNo,String name,int physics,int chemistry,int maths ) throws Exception {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicals", "root", "root");
		 PreparedStatement ps=conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
		 
		    ps.setInt(1, id);
			ps.setInt(2, rollNo);
			ps.setString(3, name);
			ps.setInt(4, physics);
			ps.setInt(5, chemistry);
			ps.setInt(6, maths);

		 int i=ps.executeUpdate();
		 System.out.println("record inserted");
		 
		
		
		
	}
	
	
	 

}
