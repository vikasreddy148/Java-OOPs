package entity;

public class Astras implements Runnable{
	String res1 = new String("BhramaAstra");
	String res2 = new String("SarpAstra");
	String res3 = new String("PasupathiAstra");

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		
		if(name.equals("Rama")) {
			ramaAquiredResourses();
		}else {
			ravanaAquiredResourses();
		}
		
	}

	private void ravanaAquiredResourses() {
		// TODO Auto-generated method stub
		try {
			synchronized (res3) {
				System.out.println("Ravana Accuired "+res3 );
				Thread.sleep(5000);
				synchronized (res2) {
					System.out.println("Ravana Accuired SarpAstra");
					Thread.sleep(5000);
					synchronized (res1) {
						System.out.println("Ravana Accuired "+ res1);
						Thread.sleep(5000);
						
					}
				}
				
			}
			
		}catch (Exception e) {
			System.out.println(e);
			
		}
		
		
	}

	private void ramaAquiredResourses() {
		try {
			synchronized (res1) {
				System.out.println("Rama Accuired Bhramstraa");
				Thread.sleep(5000);
				synchronized (res2) {
					System.out.println("Rama Accuired SarpAstra");
					Thread.sleep(5000);
					synchronized (res3) {
						System.out.println("Rama Accuired PasupathiAstra");
						Thread.sleep(5000);
						
					}
				}
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
	}

}
