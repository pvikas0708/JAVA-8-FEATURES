package in.vikas;

public class Vehicle_bike implements Vehicle_interface {

	@Override
	public void startVehicle() {
		System.out.println("starting..!");
	}

	public static void main(String[] args) {

		Vehicle_bike vb = new Vehicle_bike();
		vb.startVehicle();
	}
}
