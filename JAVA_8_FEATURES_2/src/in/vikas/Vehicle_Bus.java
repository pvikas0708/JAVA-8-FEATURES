package in.vikas;

public class Vehicle_Bus implements Vehicle_interface {

	@Override
	public void startVehicle() {
		System.out.println("Vehicle starting..!");
	}

	public static void main(String[] args) {

		Vehicle_Bus b = new Vehicle_Bus();
		b.startVehicle();
		b.cleanVehicle();
	}
}
