package entity;

public class Producer extends Thread{
	Queue q;

	public Producer(Queue q) {
		super();
		this.q = q;
	}
	public void run() {
		int i=0;
		while(true) {
			try {
				q.put(i);
				i++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	

}
