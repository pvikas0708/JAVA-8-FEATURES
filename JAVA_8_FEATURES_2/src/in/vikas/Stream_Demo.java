package in.vikas;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream_Demo {

	public static void main(String[] args) {

		// Approach-1 => with of ()
		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);

		ArrayList<String> names = new ArrayList<>();
		names.add("John");
		names.add("Robert");
		names.add("Orlen");

		// Approach-2 => with stream()
		Stream<String> stream2 = names.stream();
	}
}
