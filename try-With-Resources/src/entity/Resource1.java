package entity;

public class Resource1 implements AutoCloseable{
	public void close() {
		System.out.println("Resource1 closed");
	}
}
