package com.solid.singleResponsiblity;

public class Employee {
	private String employeeId;
	private String employeeName;
	private String employeeAddress;
	private String contactNumber;
	private String employeeType;

	public void save() {
		EmployeeRepository empRepo=new EmployeeRepository();
		empRepo.save(this);
	}
	public void calcTax() {
		new EmployeeTaxCalculator().TaxCalcualtor(this);
	}
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

}
