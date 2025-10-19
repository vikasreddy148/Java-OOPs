package test;
import entity.*;
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Charger chr = new Charger("Apple",22);
		Mobile mb = new Mobile();
		mb.setCharger(chr);
		
		System.out.println(mb);
	}

}
