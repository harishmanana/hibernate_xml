package onetoonepack;

import java.io.Serializable;
import java.sql.Date;


public class Employee implements Serializable {
	private Long employeeId;
	private String firstname;
	private String lastname;
	private Date birthDate;
	private EmployeeDetail employeeDetail;

	public Employee() {
	}

	public Employee(String firstname, String lastname, Date birthdate) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthDate = birthdate;
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

	public EmployeeDetail getEmployeeDetail() {
		return employeeDetail;
	}

	public void setEmployeeDetail(EmployeeDetail employeeDetail) {
		this.employeeDetail = employeeDetail;
	}
}
