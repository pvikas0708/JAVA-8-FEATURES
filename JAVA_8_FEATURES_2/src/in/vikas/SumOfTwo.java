package in.vikas;

import java.util.function.BiFunction;

public class SumOfTwo {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> bifunction = (a, b) -> a + b;// <T, U, R> => T,U =Input, R=>Output
		System.out.println(bifunction.apply(10, 20));
	}
}
//Output:30