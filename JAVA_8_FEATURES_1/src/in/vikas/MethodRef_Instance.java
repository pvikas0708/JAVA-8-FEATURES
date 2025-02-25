package in.vikas;

public class MethodRef_Instance {

	public void m1() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		MethodRef_Instance im = new MethodRef_Instance();

		Runnable r = im::m1;

		Thread t = new Thread(r);

		t.start();

	}
}
//Output=>12345