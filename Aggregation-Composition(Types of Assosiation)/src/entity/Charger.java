package entity;

public class Charger {
String brand;
int voltage;
public Charger(String brand, int voltage) {
	super();
	this.brand = brand;
	this.voltage = voltage;
}
@Override
public String toString() {
	return "Charger [brand=" + brand + ", voltage=" + voltage + "]";
}

}
