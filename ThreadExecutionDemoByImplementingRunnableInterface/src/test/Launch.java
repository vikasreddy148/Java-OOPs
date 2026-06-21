package test;

import entity.Demo1;
import entity.Demo2;
import entity.Demo3;

public class Launch {
	public static void main(String[] args) throws InterruptedException ,IllegalThreadStateException{
		System.out.println("Main method started ");
		System.out.println(Thread.currentThread());
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		Thread t3 = new Thread(d3);
		
		t1.start();
		
		t2.start();
	
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("t1 = " + t1.isAlive());
		System.out.println("t2 = " + t2.isAlive());
		System.out.println("t3 = " + t3.isAlive());
		System.out.println("Main method ended ");
	}
}
