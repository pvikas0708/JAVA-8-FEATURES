package in.vikas;

interface MyInterface {
	public void m1();
}

public class MethodReference {

	public static void m2() {
		System.out.println("This is m2() method..!");
	}

	public static void main(String[] args) {
		/*Consumer<String> consumer = (msg) -> System.out.println(msg);
		consumer.accept("Hi..!");*/
	
		//calling static method with class name (before java 8)
		MethodReference.m2();
		
		//from java 8
		MyInterface mi= MethodReference::m2;//Static Method Reference
		mi.m1();// Calling m1() but executing m2()=> Referring from one method to another method
		
	}
}
