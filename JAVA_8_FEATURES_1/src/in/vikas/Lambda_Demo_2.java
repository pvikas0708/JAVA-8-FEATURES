package in.vikas;

@FunctionalInterface
interface MyInterfaceTwo {

	public void m2();
}
public class Lambda_Demo_2 implements MyInterfaceTwo {

	@Override
	public void m2() {
		// logic
	}
	public static void main(String[] args) {
		System.out.println("================With Lambda================");
		// Storing lambda expression in a functional interface variable.
		MyInterfaceTwo mit = () -> System.out.println("m2() method called.!");
		mit.m2();
	}
}
/*Output:
	================With Lambda================
	m2() method called.!
*/