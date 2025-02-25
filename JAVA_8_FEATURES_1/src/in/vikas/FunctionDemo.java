package in.vikas;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<String, Integer> f = (name) -> name.length();

		System.out.println(f.apply("VikasPatil")); // 10
		System.out.println(f.apply("Kolhapur")); // 8
		System.out.println(f.apply("Maharashtra")); // 11

	}
}
