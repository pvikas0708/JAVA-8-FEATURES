package in.vikas;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_GroupBy {

	public static void main(String[] args) {
	
		Employee_Country e1 = new Employee_Country(1, "Robert", 26500.00, "USA");
		Employee_Country e2 = new Employee_Country(2, "Abraham", 46500.00, "INDIA");
		Employee_Country e3 = new Employee_Country(3, "Ching", 36500.00, "CHINA");
		Employee_Country e4 = new Employee_Country(4, "David", 16500.00, "INDIA");
		Employee_Country e5 = new Employee_Country(5, "Cathy", 25500.00, "USA") ;

		List<Employee_Country> list = Arrays.asList(e1,e2,e3,e4,e5);
		Map<String,List<Employee_Country>> data = list.stream().collect(Collectors.groupingBy(e->e.country));
		System.out.println(data);
	}
}
class Employee_Country {
	int id;
	String name;
	double salary;
	String country;

	public Employee_Country(int id, String name, double salary, String country) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee_Country [id=" + id + ", name=" + name + ", salary=" + salary + ", country=" + country + "]";
	}
	
}

