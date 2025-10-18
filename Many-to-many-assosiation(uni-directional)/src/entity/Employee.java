package entity;

import java.util.Arrays;

public class Employee {
	private int empId;
	private String empName;
	private Project [] projects;
	public Employee(int empId, String empName, Project... projects) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.projects = projects;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public Project[] getProjects() {
		return projects;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", projects=" + Arrays.toString(projects) + "]";
	}
	
}
