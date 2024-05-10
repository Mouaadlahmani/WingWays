package metier;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import hibernate.config.HibernateUtil;

public class test {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		student s1 = new student();
		s1.setId(1);
		s1.setName("Mouad");
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(s1);
		
		tx.commit();
		
		session.close();

	}

}
