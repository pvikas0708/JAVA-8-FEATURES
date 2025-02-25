package in.vikas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Operations {

	public static void main(String[] args) {

		// Approach-1 Number greater than 20
		Stream<Integer> Stream1 = Stream.of(66, 32, 45, 12, 20);

		// traditional SOP=> up to 1.7v
		System.out.println("===================Old Approach Upto 1.7v===================");
		List<Integer> list1 = Arrays.asList(66, 32, 45, 12, 20);
		for (Integer i : list1) {
			if (i > 20) {
				System.out.println(i);
			}
		}
		System.out.println("===================New Approach after 1.8v===================");
		/*Stream<Integer> stream = list.stream();
		Stream<Integer> filter = stream.filter(i-> i>20); //predicate interface takes input and returns boolean
		filter.forEach(i->System.out.println(i)); //using consumer interface which produce output*/
		
		//above code Optimized code
		List<Integer> list = Arrays.asList(66, 32, 45, 12, 20);
		list.stream().filter(i->i>20).forEach(i->System.out.println(i));
	}
}
