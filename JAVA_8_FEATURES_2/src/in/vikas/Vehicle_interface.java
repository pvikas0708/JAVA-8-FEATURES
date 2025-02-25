package in.vikas;

public interface Vehicle_interface {

	public abstract void startVehicle();

	public default void cleanVehicle() {
		System.out.println("vehicle cleaning....!");
	}

	public static void m1() {
		System.out.println("M1() method...");
	}

	public static void m2() {
		System.out.println("M2() method...");
	}

}
