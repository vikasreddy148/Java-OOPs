package entity;

public class Demo2 extends Thread{
	public void run() {
		System.out.println("Addition Activity Started");
		int n1 = 12345678;
		int n2 = 98765432;
		int res = n1+n2;
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Addition Activity Ended");
	}
}