package in.co.rays.practise;

import java.util.Date;

public class TestUser {
	public static void main(String[] args) throws Exception {
		
	
	testNextPk();
	testAdd();
	}

	private static void testAdd() throws Exception {
	
		
		UserBean bean=new UserBean();
		bean.setAddress("malwa mile");
		bean.setFirstName("akash");
		bean.setDob(new Date());
		bean.setLastName("singh");
		bean.setLoginId("ajay@123");
		bean.setPassword("12334");
		UserModel model=new UserModel();
		model.add(bean);
	
		
		
		
		
		
	}

	private static void testNextPk() throws Exception {
		UserModel model=new UserModel();
		model.nextPk();
		
	}
}
