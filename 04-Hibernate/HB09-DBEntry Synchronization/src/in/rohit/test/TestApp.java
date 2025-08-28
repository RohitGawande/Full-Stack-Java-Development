package in.rohit.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import in.rohit.model.Student;
import in.rohit.util.HibernateUtil;

public class TestApp {

	public static void main(String[] args) throws Exception {

		Session session = null;
		int id = 99;
		try {
			session = HibernateUtil.getSession();

			if (session != null) {
				Student student = session.load(Student.class, id);
				
				if (student != null) {
					System.out.println("Student id is      :: " + student.getSid());
					
					System.in.read();
					
					System.out.println("STUDENT NAME IS    :: " + student.getSname());
					System.out.println("STUDENT AGE IS     :: " + student.getSage());
					System.out.println("STUDENT ADDRESS IS :: " + student.getSaddr());
				} else
					System.out.println("Record not found for the given id :: " + id);
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
