package in.vikas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		// only input so go for Consumer (don't return anything)
		Consumer<String> c = (name) -> System.out.println(name + ",Good Evening..!");

		c.accept("Vikas");
		c.accept("Balaji");
		c.accept("Pooja");

		List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

		// Ways Available to print list Of numbers on console
		// 1) For Loop 2) For Each Loop 3) Iterator 4) ListIterator

		// 1.8v => ForEach

		numbers.forEach(i -> System.out.println(i));

	}
}
