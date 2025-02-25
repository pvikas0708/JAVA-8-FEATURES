package in.vikas;

public class Vehicle_Car implements Vehicle_interface {

	@Override
	public void startVehicle() {
		System.out.println("Vehicle started..!");
	}

	public static void main(String[] args) {
		Vehicle_Car v = new Vehicle_Car();
		v.startVehicle();
	}
}
