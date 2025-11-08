package test;
import entity.*;
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoldenEagle ge = new GoldenEagle();
		SerpentEagle se = new SerpentEagle();
		VegSparrow vs = new VegSparrow();
		NonVegSparrow nvs = new NonVegSparrow();
		Sky s = new Sky();
		s.permits(ge);
		System.out.println();
		s.permits(se);
		System.out.println();
		s.permits(vs);
		System.out.println();
		s.permits(nvs);
		

	}

}
