package entity;

public class Queue {
	int x;
	boolean value_present_in_x = false;
	
	synchronized void put(int j) throws InterruptedException {
		
		
		
		try {
			if(value_present_in_x == true) {
				wait();
			}else {
				x = j;
				System.out.println("I have produced x = " + x);
				value_present_in_x = true;
				notify();
				
			}
			Thread.sleep(5000);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	synchronized void get() {
		try {
			if(value_present_in_x == false) {
				wait();
			}else {
				
				System.out.println("I have Consumbed x = " + x);
				value_present_in_x = false;
				notify();
				
			}
			
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
	}
	

}
