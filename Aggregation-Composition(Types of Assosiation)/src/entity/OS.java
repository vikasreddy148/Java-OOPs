package entity;

public class OS {
	String name;
	int size;
	public OS(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	@Override
	public String toString() {
		return "OS [name=" + name + ", size=" + size + "]";
	}
	
}
