package part_b;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainDeleteOrder {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Order.class)
				.addAnnotatedClass(Product.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			Transaction transaction = session.beginTransaction();

			Order order = session.get(Order.class, 1);

			session.delete(order);

			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}

}
