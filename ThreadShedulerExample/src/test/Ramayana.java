package test;
import entity.Astras;
public class Ramayana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Astras ast = new Astras();
		
		
		Thread t1 = new Thread(ast);
		Thread t2 = new Thread(ast);
		t1.setName("Rama");
		t2.setName("Ravana");
		
		t1.start();
		t2.start();

	}

}
