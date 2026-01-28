package entity;

import java.util.Scanner;

public class Demo1 extends Thread{
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Banking Activity Started");
		System.out.println("Enter the Account Number: ");
		int accNo = sc.nextInt();
		
		System.out.println(Thread.currentThread());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Banking Activity Ended");
		
	}
}
