package onetomanypack;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;


public class Employee implements Serializable {
	private Long employeeId;
	private String firstname;
	private String lastname;
	private Date birthDate;
	private Set<Vehicle> vehicle = new HashSet<Vehicle>();

	public Employee() {
	}

	public Employee(String firstname, String lastname, Date birthDate, Set<Vehicle> vehicle) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthDate = birthDate;
		this.vehicle = vehicle;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Set<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(Set<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
}
