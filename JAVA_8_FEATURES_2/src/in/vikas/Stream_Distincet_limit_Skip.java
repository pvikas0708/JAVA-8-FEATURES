package in.vikas;

import java.util.Arrays;
import java.util.List;

public class Stream_Distincet_limit_Skip {

	public static void main(String[] args) {
		List<String> javacourses = Arrays.asList("corejava", "advjava", "springboot", "restapi", "microservices");

		javacourses.stream().limit(3).forEach(c -> System.out.println(c));// gives only 1st 3
		System.out.println();
		javacourses.stream().skip(3).forEach(c -> System.out.println(c));// skips 1st 3

		System.out.println();
		List<String> names = Arrays.asList("raja", "rani", "raja", "rani", "guru");
		names.stream().distinct().forEach(name -> System.out.println(name));// Avoids double printing
	}
}
