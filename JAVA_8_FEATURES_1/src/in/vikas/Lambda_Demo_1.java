package in.vikas;

interface MyInterfaceOne {

	public void m1();
}

public class Lambda_Demo_1 implements MyInterfaceOne {

	@Override
	public void m1() {
		System.out.println("M1() method called");

	}

	public static void main(String[] args) {
		System.out.println("===============Without Lambda==============");
		Lambda_Demo_1 d = new Lambda_Demo_1();
		d.m1();

	}
}
/*Output;
===============Without Lambda==============
M1() method called
*/