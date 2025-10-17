package com.lpu.test;
import com.lpu.entities.*;
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		Employee emp = new Employee();
		acc.setAccName("SBI");
		acc.setAccNo(23587);
		acc.setAccType("Savings");
		emp.setEmpName("Vikas Reddy");
		emp.setAcc(acc);
		emp.setEmpId(12221499);
		emp.setEmpAddress("Hyderabad");
		System.out.println(emp);
	}

}
