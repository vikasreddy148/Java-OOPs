package test;
import  cars.*;
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ferrari f = new Ferrari();
		Innova i = new Innova();
		Maruti800 m = new Maruti800();
		f.start();
		f.accelerate();
		f.combustion();
		f.drive();
		f.stop();
		i.start();
		i.accelerate();
		i.drive();
		i.combustion();
		i.stop();
		m.start();
		m.drive();
		m.combustion();
		m.stop();
		

	}

}
