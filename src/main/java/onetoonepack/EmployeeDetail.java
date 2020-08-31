package onetoonepack;

import java.io.Serializable;

public class EmployeeDetail implements Serializable {
	private Long employeeId;
	private String city;
	private Employee employee;

	public EmployeeDetail() {
	}

	public EmployeeDetail(String city) {
		this.city = city;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
}