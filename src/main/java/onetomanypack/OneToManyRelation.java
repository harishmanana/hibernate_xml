package onetomanypack;

import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class OneToManyRelation {
	public static void main(String[] args) {
		System.out.println("One to one relationship");
		SessionFactory sf = new Configuration().configure()
				.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		Set<Vehicle> allVehicles = new HashSet<Vehicle>();
		allVehicles.add(new Vehicle("Hinda City"));
		allVehicles.add(new Vehicle("Maruti Ciaz"));
		
		Employee employee = new Employee("Harish", "Manana", new Date(121212), allVehicles);
		employee.setEmployeeId((long)210);
		employee.setVehicle(allVehicles);
				
		session.save(employee);
		tx.commit();

		System.out.println("Record Saved............");
		
//		List<Employee> employees = session.createQuery("from Employee").list();
//		for (Employee employee1 : employees) {
//			System.out.println(employee1.getFirstname() + " , "
//					+ employee1.getEmployeeDetail().getCity());
//		}
		session.close();
	}
}
