package in.co.rays.collage;

import java.util.Iterator;
import java.util.List;

public class TestCollage {
	public static void main(String[] args) throws Exception {
		
	
	testDynaSearch();
	}

	private static void testDynaSearch() throws Exception {
		CollageBean bean=new CollageBean();
		bean.setHod("d");
		CollageModel model=new CollageModel();
		List list =model.dynaSearch(bean, 1, 1);
		Iterator it=list.iterator();
		while(it.hasNext()) {
			 bean=(CollageBean)it.next();
			 System.out.print("\t"+bean.getId());
			 System.out.print("\t"+bean.getBranch());
			 System.out.print("\t"+bean.getStudentCount());
			 System.out.print("\t"+bean.getHod());
			 System.out.print("\t"+bean.getCr());
			
		}
		
		
	}
}
