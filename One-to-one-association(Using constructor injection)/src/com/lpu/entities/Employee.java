package com.lpu.entities;

public class Employee {
	private int empId;
	private String empName;
	private String empAddress;
	private Account acc;


	public Employee(int empId, String empName, String empAddress, Account acc) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.acc = acc;
	}
	
	public int getEmpId() {
		return empId;
	}


	public String getEmpName() {
		return empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}


	public Account getAcc() {
		return acc;
	}

	@Override
	public String toString() {
		return "Employee Details : \n" + 
				"Name: " + getEmpName() +"\n" + 
				"Id: "+ getEmpId() + "\n" +
				"Account : " + getAcc() + "\n" +
				"Address: "+getEmpAddress() + "\n";
	}
	
}
