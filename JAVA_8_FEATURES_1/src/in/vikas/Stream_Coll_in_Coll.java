package in.vikas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Coll_in_Coll {

	public static void main(String[] args) {

		List<String> javaCourses = Arrays.asList("core java", "adv java", "springboot");
		List<String> uiCourses = Arrays.asList("html", "css", "bs", "js");

		List<List<String>> courses = Arrays.asList(javaCourses, uiCourses);

		// courses.stream().forEach(c->System.out.println(c));

		//when collection under collection go for flatMap which gives each collection converted in stream
		Stream<String> fm = courses.stream().flatMap(s -> s.stream());

		fm.forEach(c -> System.out.println(c));
	}
}
/*Output:
	core java
	adv java
	springboot
	html
	css
	bs
	js
*/