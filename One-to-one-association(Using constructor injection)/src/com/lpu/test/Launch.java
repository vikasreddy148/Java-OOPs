package com.lpu.test;
import com.lpu.entities.*;
public class Launch {
	public static void main(String[] args) {
		Account acc = new Account(123456,"savings","SBI");
		Employee emp = new Employee(1,"vikas","Hyderabad",acc);
		
		
		System.out.println(emp);
	}
}
