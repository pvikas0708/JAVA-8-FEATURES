package in.vikas;

import java.util.Arrays;
import java.util.List;

public class Stream_Mapping_Opt {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("India", "usa", "uk", "Japan");

		System.out.println("==========Traditional Approach=============");

		for (String name : names) {
			System.out.println(name.toUpperCase());
		}

		System.out.println("==========New Approach=============");

		names.stream().map(name -> name.toUpperCase()).forEach(n -> System.out.println(n));

	}
}
/*Output:
	==========Traditional Approach=============
	INDIA
	USA
	UK
	JAPAN
	==========New Approach=============
	INDIA
	USA
	UK
	JAPAN
*/