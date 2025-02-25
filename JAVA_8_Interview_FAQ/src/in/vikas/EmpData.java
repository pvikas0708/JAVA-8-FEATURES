package in.vikas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpData {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		employeeList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

		// How many male and female employees are there in the organization ?
		Map<String, Long> map1 = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(map1);//{Male=11, Female=5}
		
		//Print the name of all departments in the organization ?//need unique dept names
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(name->System.out.println(name));//gives unique dept 
		
		//What is the average age of male and female employees ?
		Map<String,Double> map2 = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		System.out.println(map2);
		
		//Get the details of highest paid employee in the organization ?
		Optional<Employee> optional = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		if(optional.isPresent())
		{
			Employee employee = optional.get();
			System.out.println(employee);
		}
		
		//Get the names of all employees who have joined after 2015 ? =.filters
		employeeList.stream()
		.filter(e->e.yearOfJoining>2015)
		.map(e->e.name)
		.forEach(name->System.out.println(name));
		
		//Count the number of employees in each department ? =collectors
		Map<String,Long> map3 = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		
		System.out.println(map3);//{Sales=3, Finance=2, Development=4, Infrastructure=3, HR=2, Security=2}
		
		//What is the average salary of each department ?
		Map<String, Double> map = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
			System.out.println(map);

		//Get the details of youngest male employee in the Development department ?=>filter
		Optional<Employee> optional3 = employeeList.stream()
				.filter(e->e.getGender().equals("Male")&&e.getDepartment()
						.equals("Development")).min(Comparator.comparing(Employee::getAge));
		
		if(optional3.isPresent())
		{
			System.out.println(optional3.get());
		}
		
		//Who has the most working experience in the organization ?
		Optional<Employee> optional1 = employeeList.stream()
		.collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
		
		if(optional1.isPresent()) {
			System.out.println(optional1.get());
		}

		//How many male and female employees are there in the Sales team ?
		Map<String,Long> map4 = employeeList.stream().filter(e -> e.getDepartment().equals("Sales"))
		.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		
		System.out.println(map4);//{Female=1, Male=2}
	
		//which emp hving highest salary?
		Optional<Employee> optional5 = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println(optional5);
		
		//Second Highest and 3rd highest salary? =>sort the record in reverse order and skip one record & 2 records
		
		//second highest=> sort employees based on salary descending order then skip first record
		//employeeList.stream().sorted(); it will sort in ascending orser
		
		//Approach-1
		Optional<Employee> findFirst = employeeList.stream()
				.sorted(Comparator.comparing(Employee::getSalary)
				.reversed()).skip(1)
				.findFirst();
		System.out.println(findFirst.get());
		
		//Approach-2
		
		List<Employee> collect = employeeList.stream()
				.sorted(Comparator.comparing(Employee::getSalary)
				.reversed())
				.collect(Collectors.toList());
		System.out.println(collect.get(1));//geting index no 1 => second Highest salary 3 index for third highest salary
		
		
		
		
		
		
	}
}
