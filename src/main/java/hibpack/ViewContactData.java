package hibpack;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

/**
 * Hibernate example to insert data into Contact table
 */

public class ViewContactData {
	public static void main(String[] args) {
		Session session = null;
		try {
			// This step will read hibernate.cfg.xml and prepare hibernate for
			// use
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();

			Transaction newTransaction = session.beginTransaction();
			List contacts = session.createQuery("from Contact c").list();
			System.out.println(contacts.size() + " contact(s) found:");
			for (Iterator iter = contacts.iterator(); iter.hasNext();) {
				Contact loadedContact = (Contact) iter.next();
				System.out.println(loadedContact.getFirstName());
			}
			newTransaction.commit();
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
