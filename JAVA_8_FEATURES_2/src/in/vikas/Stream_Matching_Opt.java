package in.vikas;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream_Matching_Opt {

	public static void main(String[] args) {
		Person_Matching p1 = new Person_Matching("Vikas", "IND");
		Person_Matching p2 = new Person_Matching("BAlaji", "USA");
		Person_Matching p3 = new Person_Matching("Shreyas", "AUS");
		Person_Matching p4 = new Person_Matching("Pooja", "UK");
		Person_Matching p5 = new Person_Matching("Kumar", "IND");

		List<Person_Matching> persons = Arrays.asList(p1, p2, p3, p4,p5);
		boolean status = persons.stream().anyMatch(p -> p.country.equals("IND"));// Predicate returns boolean
		System.out.println("Any Indian Available:: ?" + status);

		//To check person available from India
		boolean status2 = persons.stream().allMatch(p -> p.country.equals("IND"));
		System.out.println("Are All Indian:: ?" + status2);

		//To check person available from Mexico
		boolean status3 = persons.stream().noneMatch(p -> p.country.equals("MEXICO"));
		System.out.println("No Persons from Mexico ? :: " + status3);

		//To check person available from India if yes retrieving it
		Optional<Person_Matching> findFirst = persons.stream()
													 .filter(p -> p.country.equals("IND"))
													 .findFirst();//if two persons available it retrieves 1st one

		if (findFirst.isPresent()) {
			System.out.println(findFirst.get()); //Override toString to print else Obj will be printed
		}
	}
}

class Person_Matching {
	String name;
	String country;

	public Person_Matching(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person_Matching [name=" + name + ", country=" + country + "]";
	}
	
}
/*Output:
	Any Indian Available:: ?true
			Are All Indian:: ?false
			No Persons from Mexico ? :: true
			Person_Matching [name=Vikas, country=IND]
*/