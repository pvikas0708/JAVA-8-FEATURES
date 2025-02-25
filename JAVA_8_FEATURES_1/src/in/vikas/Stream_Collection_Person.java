package in.vikas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Collection_Person {

	public static void main(String[] args) {

		Person_Collection p1 = new Person_Collection("vikas", "USA");
		Person_Collection p2 = new Person_Collection("Balaji", "JAPAN");
		Person_Collection p3 = new Person_Collection("Pooja", "INDIA");
		Person_Collection p4 = new Person_Collection("Shreyas", "CHINA");
		Person_Collection p5 = new Person_Collection("Juhee", "INDIA");

		List<Person_Collection> persons = Arrays.asList(p1, p2, p3, p4, p5);

		List<Person_Collection> indians = persons.stream()
												 .filter(p->p.country
												 .equals("INDIA"))
												 .collect(Collectors.toList());
		System.out.println(indians.size()); //to get total
		indians.forEach(i->System.out.println(i));
		
	}

}

class Person_Collection {

	String name;
	String country;

	public Person_Collection(String name, String country) {
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person_Collection [name=" + name + ", country=" + country + "]";
	}

}
/*Output:
	2
	Person_Collection [name=Pooja, country=INDIA]
	Person_Collection [name=Juhee, country=INDIA]
*/