package com.lpu.entities;

public class Employee {
	private int empId;
	private String empName;
	private String empAddress;
	private Account acc;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	public String toString() {
		return getEmpName()+"\n"+
				getEmpId()+"\n"+
				getEmpAddress()+"\n"+
				getAcc() ;
	}

}
