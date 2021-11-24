package part_b;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainCreateProduct {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Order.class)
				.addAnnotatedClass(Product.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			Transaction transaction = session.beginTransaction();

			session.save(new Product("can"));

			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}

}
