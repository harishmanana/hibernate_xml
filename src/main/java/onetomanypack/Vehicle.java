package onetomanypack;

import java.io.Serializable;

public class Vehicle implements Serializable{ 
	private int vehicleNo;
	private String vehicleName;
	private Employee emp;
	
	public Vehicle() {
		
	}
	public Vehicle(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public int getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
}
