
public class Launch {

	public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Car myCar = new Car();
        Bike myBike = new Bike();
        Truck myTruck = new Truck();
        MiniTruck myMiniTruck = new MiniTruck();

        System.out.println("--- Calling disp() on each object ---");
        myVehicle.disp();
        myCar.disp();
        myBike.disp();
        myTruck.disp();
        myMiniTruck.disp();
	}

}
