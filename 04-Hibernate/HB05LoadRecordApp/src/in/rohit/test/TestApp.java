package in.rohit.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import in.rohit.model.Student;
import in.rohit.util.HibernateUtil;

public class TestApp {

	public static void main(String[] args) throws Exception {

		Session session = null;
		int id = 18;

		try {
			session = HibernateUtil.getSession();
			Student student = session.get(Student.class, id);
			System.out.println("Before updation in the table :: " + student);

			if (student != null) {
				System.in.read();// go to DB and make the change

				session.refresh(student);

				System.out.println("After updation in the table :: " + student);

			} else {
				System.out.println("Record available for the given id :: " + id);
			}

		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}

}
