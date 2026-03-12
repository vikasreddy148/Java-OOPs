package test;

import entity.*;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource2 r2 = new Resource2() ;
		final Resource3 r3 = new Resource3();
		try(Resource1 r1 = new Resource1();r2;r3){
			
		}catch(Exception e){
			
		}
		
	}

}	


