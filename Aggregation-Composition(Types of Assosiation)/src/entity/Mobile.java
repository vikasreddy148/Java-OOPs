package entity;

public class Mobile {
	int price = 1000;
	String processor = "Snapdragon";
	OS os = new OS("Android",512);
	Charger charger;
	
	public void setCharger(Charger charger) {
		this.charger=charger;
	}

	@Override
	public String toString() {
		return "Mobile [price=" + price + ", processor=" + processor + ", os=" + os + ", charger=" + charger + "]";
	}
	
	
}
