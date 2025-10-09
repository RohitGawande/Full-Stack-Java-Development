package in.rohit.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.rohit.model.Student;
import in.rohit.util.HibernateUtil;

public class SaveApp {

    public static void main(String[] args) {

        Session session = null;
        Transaction transaction = null;
        boolean flag = false;
        Integer id = null;   // declare outside so available in finally block

        try {
            session = HibernateUtil.getSession();

            if (session != null)
                transaction = session.beginTransaction();

            if (transaction != null) {
                Student student = new Student();
                student.setSid(10);
                student.setSname("Rohit");
                student.setSaddr("MI");
                student.setSage(39);

                id = (Integer) session.save(student);  // save returns generated identifier
                flag = true;
            }

        } catch (HibernateException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (transaction != null) {
                if (flag) {
                    transaction.commit();
                    System.out.println("Object saved to database....");
                    System.out.println("Object saved with id :: " + id);
                } else {
                    transaction.rollback();
                    System.out.println("Object not saved to database...");
                }
            }

            HibernateUtil.closeSession(session);
            HibernateUtil.closeSessionFactory();
        }
    }
}
