package in.vikas;

import java.util.Arrays;
import java.util.List;

public class Stream_Operations_Names {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("vikas", "Balaji", "Pooja", "Juhee", "Shreyas");
		list.stream().filter(i -> i.startsWith("v")).forEach(i -> System.out.println(i));
	}
}
//Output:vikas