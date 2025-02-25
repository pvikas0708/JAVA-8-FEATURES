package in.vikas;

import java.util.stream.Stream;

public class Stream_EmpSalary {

	public static void main(String[] args) {

		Emp e1 = new Emp("John", 35, 55000.00);
		Emp e2 = new Emp("David", 25, 45000.00);
		Emp e3 = new Emp("Buttler", 35, 35000.00);
		Emp e4 = new Emp("Steve", 45, 65000.00);

		Stream<Emp> stream = Stream.of(e1, e2, e3, e4);

		//approach-1 =>with map
		stream.filter(e -> e.salary >= 50000)
					.map(e -> e.name + " " + e.age)
					.forEach(e -> System.out.println(e));
		
		//approach-2 =>without map
	//	stream.filter(e->e.salary>=50000).forEach(e->System.out.println(e.name+"-"+e.age));
		
	}
}

class Emp {
	String name;
	int age;
	double salary;

	public Emp(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

}