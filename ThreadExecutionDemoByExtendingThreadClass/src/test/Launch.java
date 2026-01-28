package test;
import entity.*;
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		d1.start();
		System.out.println(Thread.currentThread());
		d2.start();
		d3.start();
		
	}

}
