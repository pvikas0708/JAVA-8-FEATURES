package in.vikas;

import java.util.stream.Stream;

public class Stream_Operations_WithTwo_Con {

	String name;
	int age;

	public Stream_Operations_WithTwo_Con(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Stream_Operations_WithTwo_Con [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		Stream_Operations_WithTwo_Con u1 = new Stream_Operations_WithTwo_Con("Shreyas", 25);
		Stream_Operations_WithTwo_Con u2 = new Stream_Operations_WithTwo_Con("Raju", 30);
		Stream_Operations_WithTwo_Con u3 = new Stream_Operations_WithTwo_Con("Suraj", 15);
		Stream_Operations_WithTwo_Con u4 = new Stream_Operations_WithTwo_Con("Juhee", 10);
		Stream_Operations_WithTwo_Con u5 = new Stream_Operations_WithTwo_Con("Rani", 35);
		Stream_Operations_WithTwo_Con u6 = new Stream_Operations_WithTwo_Con("Rajiv", 30);

		System.out.println("=====================Approach-1-to-print=====================");
		Stream<Stream_Operations_WithTwo_Con> stream = Stream.of(u1, u2, u3, u4, u5, u6);
		stream.filter(u -> u.age >= 18 && u.name.startsWith("R")).forEach(u -> System.out.println(u));
		
		System.out.println("=====================Approach-2-to-print=====================");
		stream.filter(u -> u.age >= 18)
	    .filter(u -> u.name.startsWith("A"))
	    .forEach(u -> System.out.println(u));


	}

}
/*Output:
	Stream_Operations_WithTwo_Con [name=Raju, age=30]
			Stream_Operations_WithTwo_Con [name=Rani, age=35]
			Stream_Operations_WithTwo_Con [name=Rajiv, age=30]
*/