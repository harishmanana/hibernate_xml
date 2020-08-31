package onetoonepack;

import java.sql.Date;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class OneToOneRelation {
	public static void main(String[] args) {
		System.out.println("One to one relationship");
		SessionFactory sf = new Configuration().configure()
				.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		EmployeeDetail employeeDetail = new EmployeeDetail("Chennai");
		
		Employee employee = new Employee("Sandhya", "G", new Date(121212));
		employee.setEmployeeId((long)200);
		employee.setEmployeeDetail(employeeDetail);
		
		employeeDetail.setEmployee(employee);
		
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
