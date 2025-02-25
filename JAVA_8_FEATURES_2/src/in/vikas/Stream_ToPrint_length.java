package in.vikas;

import java.util.Arrays;
import java.util.List;

public class Stream_ToPrint_length {

	public static void main(String[] args) {
	
		List<String> names = Arrays.asList("vikas", "Balaji", "Raju", "Rani", "Pooja", "Rajiv", "Juhee");

		// print name with its length which are starting with 'R' using Stream API
		//Raju-4
		//Rani-4
		//Rajiv-5
		
		names.stream()
					  .filter(name->name.startsWith("R"))//Filtering
					  .map(name->name+"-"+name.length())//Transforming
					  .forEach(name->System.out.println(name));
		 		
	}
}
