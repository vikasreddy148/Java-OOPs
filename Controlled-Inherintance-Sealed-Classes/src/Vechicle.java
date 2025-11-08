 sealed class Vehicle {
	 void disp() {
		 System.out.println("This is a Vehicle");
	 }
}
final class Car extends Vehicle{
	void disp() {
		 System.out.println("This is a Car");
	 }

}
non-sealed class Bike extends Vehicle{
	void disp() {
		 System.out.println("This is a Bike");
	 }
}
sealed class Truck extends Vehicle permits MiniTruck{
	void disp() {
		 System.out.println("This is a Truck");
	 }
}
final class MiniTruck extends Truck{
	void disp() {
		 System.out.println("This is a MiniTruck");
	 }
}
