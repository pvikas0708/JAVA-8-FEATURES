package in.vikas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Max_Min_Avg_Salary {

	public static void main(String[] args) {

		Employee_Salary e1 = new Employee_Salary(1, "Vikas", 55000.00);
		Employee_Salary e2 = new Employee_Salary(2, "Balaji", 65000.00);
		Employee_Salary e3 = new Employee_Salary(3, "Shreyas", 75000.00);
		Employee_Salary e4 = new Employee_Salary(4, "Pooja", 85000.00);
		Employee_Salary e5 = new Employee_Salary(5, "Juhee", 95000.00);

		List<Employee_Salary> list = Arrays.asList(e1,e2,e3,e4,e5); //to avoid every time creating new stream
		//Stream<Employee_Salary> stream = list.Stream.of(e1, e2, e3, e4, e5); //valid for only one opt for next opration we need to create new stream
		
		//Max salary
		Optional<Employee_Salary> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));//To get max salary by comaring ech
		System.out.println("Max Salary::"+max.get().salary);
		System.out.println("Max Salary::"+max.get());//Override toString in Employee_Salary to print name on console  
		
		//Min salary 
		Optional<Employee_Salary> min = list.stream().collect(Collectors.minBy(Comparator.comparing(e->e.salary)));
		System.out.println("Min Salary:;"+min.get().salary);
		System.out.println("Min Salary:;"+min.get());
		
		//Average Salary
		Double avgSalary = list.stream().collect(Collectors.averagingDouble(e->e.salary));
		System.out.println("Average Salary::"+avgSalary);
	
		
	}

}

class Employee_Salary {
	int id;
	String name;
	double salary;

	public Employee_Salary(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee_Salary [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
/*Output:
	Max Salary::95000.0
	Max Salary::Employee_Salary [id=5, name=Juhee, salary=95000.0]
	Min Salary:;55000.0
	Min Salary:;Employee_Salary [id=1, name=Vikas, salary=55000.0]
	Average Salary::75000.0
*/