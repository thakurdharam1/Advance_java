package in.co.rays.practise;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
		testAdd();
		testNextPk();
	}

	private static void testNextPk() throws Exception {
		MarksheetModel model=new MarksheetModel();
		int pk= model.nextPk();
		System.out.println("pk "+pk);
		
	}

	private static void testAdd() throws Exception {
		
		MarksheetBean bean=new MarksheetBean();
		bean.setChemistry(97);
		bean.setId(1);
		bean.setMaths(98);
		bean.setPhysics(99);
		bean.setRoll_no(101);
		bean.setName("aaa");
		MarksheetModel model=new MarksheetModel();
		model.add(bean);
		
	}

}
