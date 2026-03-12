package entity;

public class Resource2 implements AutoCloseable{
	public void close() {
		System.out.println("Resource2 closed");
	}
}
