package in.co.rays.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class DynamicPSTMTBeanCrud {
	public static void main(String[] args) throws Exception {
		MarklsheetBean m=new MarklsheetBean();
		m.setId(4);
		m.setChemistry(70);
		m.setMaths(97);
		m.setName("parul");
		m.setPhysics(67);
		m.setRooNo(777);
		
		//testInsertBean(m);
		//testUpdate("kamlesh",4);
		//testDelete(9);
		testRead();
				
	}

	public  static void testInsertBean(MarklsheetBean m) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicals", "root", "root");
		PreparedStatement ps=conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
		ps.setInt(1, m.getId());
		ps.setString(3, m.getName());
		ps.setInt(2, m.getRooNo());
		ps.setInt(4, m.getChemistry());
		ps.setInt(5, m.getMaths());
		ps.setInt(6, m.getPhysics());
		
		int i=ps.executeUpdate();
		System.out.println("inserted");
		
		
		
	}
	public static void testUpdate(String name,int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicals", "root", "root");
		PreparedStatement ps=conn.prepareStatement("update marksheet set name=? where id=?");
		ps.setString(1, name);
	
		ps.setInt(2, id);
		int i=ps.executeUpdate();
		System.out.println("updated");
				
		
	}
	public static void testDelete(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicals", "root", "root");
		PreparedStatement ps=conn.prepareStatement("delete marksheet where id=?");
		
	
		ps.setInt(2, id);
		int i=ps.executeUpdate();
		System.out.println("deleted");
		
	}
	public static void testRead() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicals", "root", "root");

		PreparedStatement ps = conn.prepareStatement("select * from marksheet");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print("\t" + rs.getInt(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getInt(4));
			System.out.print("\t" + rs.getInt(5));
			System.out.println("\t" + rs.getInt(6));
	}
	}

}
