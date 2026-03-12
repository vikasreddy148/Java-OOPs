package entity;

public class Resource3 implements AutoCloseable{
	public void close() {
		System.out.println("Resource3 closed");
	}
}
