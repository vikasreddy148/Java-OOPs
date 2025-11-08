package test;
import entity.*;
public class Launch {
	public static void main(String[] args) {
		Deer d = new Deer();
		Tiger t = new Tiger();
		Monkey m = new Monkey();
		Forest f = new Forest();
		f.permits(d);
		f.permits(m);
		f.permits(t);
	}
}
