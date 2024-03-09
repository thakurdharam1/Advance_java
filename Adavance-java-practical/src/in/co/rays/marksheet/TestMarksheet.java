package in.co.rays.marksheet;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
		//findByPk();
		//searchSimple();
		//delete();
		//update();
		add();
		 //testSearch();
		testNextPk();
		
	
}
	private static void testNextPk() throws Exception {

		MarksheetModel model = new MarksheetModel();

		int pk = model.nextPk();

		System.out.println("pk = " + pk);

	}



	



	private static void add() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(14);
		bean.setRollNo(114);
		bean.setName("Adarsh");
		bean.setPhysics(70);
		bean.setChemistry(70);
		bean.setMaths(70);
		

		MarksheetModel model = new MarksheetModel();
		model.add(bean);
		
	}

	private static void update() throws Exception {
		
		MarksheetBean bean = new MarksheetBean();
		bean.setId(7);
		bean.setRollNo(107);
		bean.setName("Jay");
		bean.setPhysics(100);
		bean.setChemistry(100);
		bean.setMaths(100);
	

		MarksheetModel model = new MarksheetModel();
		model.update(bean);

		
	
		
	}

	private static void delete() throws Exception {
		MarksheetModel model=new MarksheetModel();
		model.delete(14);
		
	}

	private static void searchSimple() throws Exception  {

		MarksheetModel model = new MarksheetModel();
		List list = model.searchSimple();
		Iterator it = list.iterator();

		while (it.hasNext()) {
			MarksheetBean bean = (MarksheetBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());
		}
		
		
	}

	private static void findByPk() throws Exception {
		MarksheetModel model=new MarksheetModel();
		MarksheetBean bean=model.findByPk(1);
		System.out.print( bean.getId());
		System.out.print("\t" + bean.getRollNo());
		System.out.print("\t" + bean.getName());
		System.out.print("\t" + bean.getPhysics());
		System.out.print("\t" + bean.getChemistry());
		System.out.print("\t" + bean.getMaths());
		
		
		
	}
	private static void testSearch() throws Exception {

		MarksheetBean bean = new MarksheetBean();
		bean.setId(6);
		bean.setName("b");

		MarksheetModel model = new MarksheetModel();

		List list = model.search(null, 2, 0);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (MarksheetBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());
		}
	}
	

}
