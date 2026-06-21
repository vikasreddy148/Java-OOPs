package entity;

import java.util.Scanner;

public class Demo1 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread());
		Scanner sc = new Scanner(System.in);
		System.out.println("Banking Activity Started");
		System.out.println("Enter the Account Number: ");
//		int accNo = sc.nextInt();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Banking Activity Ended");
		
	}
}
