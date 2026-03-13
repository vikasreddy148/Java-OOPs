package entity;

public class Consumer extends Thread{
	Queue q;

	public Consumer(Queue q) {
		super();
		this.q = q;
	}
	public void run() {
		while(true) {
			try {
				q.get();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
