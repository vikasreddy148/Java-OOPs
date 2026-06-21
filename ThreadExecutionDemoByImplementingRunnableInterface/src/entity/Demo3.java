package entity;

public class Demo3 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread());
		System.out.println("Printing Activity Started");
		for(int i=65;i<=69;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}