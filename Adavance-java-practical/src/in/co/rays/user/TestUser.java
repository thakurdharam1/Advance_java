package in.co.rays.user;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestUser {
	public static void main(String[] args) throws Exception {
		// testNextPk();
		// testAdd();
		// testUpdate();
		// testDelete();
		// testFindPybyPk();
		// testSearch();
		testDynaSearch();

	}

	private static void testDynaSearch() throws Exception {
		UserBean bean = new UserBean();
		bean.setFirst_name("x");
		Usermodel model = new Usermodel();
		List list = model.dynaSearch(bean, 1, 5);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			bean = (UserBean) it.next();
			System.out.print(bean.getFirst_name());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLogin_id());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getDob());
			System.out.print("\t" + bean.getAddress());
			System.out.println("\t" + bean.getId());
		}

	}

	private static void testSearch() throws Exception {
		Usermodel model = new Usermodel();
		List list = model.search();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			UserBean bean = (UserBean) it.next();
			System.out.print(bean.getFirst_name());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLogin_id());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getDob());
			System.out.print("\t" + bean.getAddress());
			System.out.println("\t" + bean.getId());
		}

	}

	private static void testFindPybyPk() throws Exception {
		Usermodel model = new Usermodel();
		UserBean bean = model.findByPk(10);
		System.out.print(bean.getFirst_name());
		System.out.print("\t" + bean.getLastName());
		System.out.print("\t" + bean.getLogin_id());
		System.out.print("\t" + bean.getPassword());
		System.out.print("\t" + bean.getDob());
		System.out.print("\t" + bean.getAddress());
		System.out.println("\t" + bean.getId());

	}

	private static void testDelete() throws Exception {
		Usermodel model = new Usermodel();
		model.delete(19);

	}

	private static void testUpdate() throws Exception {
		UserBean bean = new UserBean();
		bean.setId(9);
		bean.setFirst_name("xyz");
		bean.setLastName("ytt");
		bean.setLogin_id("xyz@gmail.com");
		bean.setPassword("123");
		bean.setDob(new Date());
		bean.setAddress("indore");

		Usermodel model = new Usermodel();
		model.update(bean);

	}

	private static void testNextPk() throws Exception {
		Usermodel model = new Usermodel();
		model.nextPk();

	}

	private static void testAdd() throws Exception {
		UserBean bean = new UserBean();
		bean.setFirst_name("xyz");
		bean.setLastName("abc");
		bean.setLogin_id("xyz@gmail.com");
		bean.setPassword("123");
		bean.setDob(new Date());
		bean.setAddress("indore");

		Usermodel model = new Usermodel();
		model.add(bean);

	}

}
