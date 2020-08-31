package hibpack;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate example to insert data into Contact table
 */

public class FirstExample {
	public static void main(String[] args) {
		Session session = null;

		try {
			// This step will read hibernate.cfg.xml and prepare hibernate for
			// use
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			
			Transaction tx = session.beginTransaction();
			
			// Create new instance of Contact and set values in it
			System.out.println("Inserting Record");
			Contact contact = new Contact();
			contact.setId(100);
			contact.setFirstName("Harish");
			contact.setLastName("Manana");
			contact.setEmail("harishmanana@yahoo.com");
			session.save(contact);
			session.save(contact);
			session.save(contact);
			System.out.println("Done");
			tx.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// Actual contact insertion will happen at this step
			session.flush();
			session.close();
		}
	}
}
