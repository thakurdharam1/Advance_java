package in.co.rays.collage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CollageModel {
	public List dynaSearch(CollageBean bean,int pageNo,int pageSize) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		StringBuffer sql=new StringBuffer("select * from collage where 1=1");
		if(bean!=null) {
			if(bean.getHod()!=null && bean.getHod().length()>0) {
				sql.append(" and hod like '" + bean.getHod()+ "%'");
			}
		}
		if(pageSize>0) {
			pageNo=(pageNo-1)*pageSize;
			sql.append(" limit " +pageNo+ "," +pageSize);
			
		}
		System.out.println(sql);
		PreparedStatement ps=conn.prepareStatement(sql.toString());
		ResultSet rs=ps.executeQuery();
		List list =new ArrayList();
		while(rs.next()) {
			bean=new CollageBean();
			bean.setId(rs.getInt(1));
			bean.setBranch(rs.getString(2));
			bean.setStudentCount(rs.getInt(3));
			bean.setHod(rs.getString(4));
			bean.setCr(rs.getString(5));
			list.add(bean);
		}
		
		
		return list;
		
	}

}
