package in.vikas;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class Stream_SplIterator {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("sachin", "sehwag", "dhoni");

		Spliterator<String> spliterator = names.stream().spliterator();

		spliterator.forEachRemaining(n -> System.out.println(n));

	}
}
