package in.vikas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Collection_Person_India_NM {
	public static void main(String[] args) {

		Person_Ind_Nm p1 = new Person_Ind_Nm("vikas", "USA");
		Person_Ind_Nm p2 = new Person_Ind_Nm("Balaji", "JAPAN");
		Person_Ind_Nm p3 = new Person_Ind_Nm("Pooja", "INDIA");
		Person_Ind_Nm p4 = new Person_Ind_Nm("Juhee", "CHINA");
		Person_Ind_Nm p5 = new Person_Ind_Nm("Shreyas", "INDIA");

		List<Person_Ind_Nm> persons = Arrays.asList(p1,p2,p3,p4,p5);
		
		// collect names of persons who are belongs to india and store into names collection
		
		List<String> names = persons.stream()
									.filter(p -> p.country.equals("INDIA"))//gives All the persons from INDIA
									.map(p -> p.name)//takes names only
									.collect(Collectors.toList());
		System.out.println(names);
	}

	
}
class Person_Ind_Nm {

	String name;
	String country;

	public Person_Ind_Nm(String name, String country) {
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}

}
//Output:[Pooja, Shreyas]

