package in.vikas;

import java.util.stream.Stream;

public class Stream_Operations_Obj_User {

	String name;
	int age;

	public Stream_Operations_Obj_User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Age greater than 18 people are : name=" + name + " age=" + age + "";
	}

	public static void main(String[] args) {

		Stream_Operations_Obj_User u1 = new Stream_Operations_Obj_User("Shreyas", 25);
		Stream_Operations_Obj_User u2 = new Stream_Operations_Obj_User("vikas", 30);
		Stream_Operations_Obj_User u3 = new Stream_Operations_Obj_User("Suraj", 15);
		Stream_Operations_Obj_User u4 = new Stream_Operations_Obj_User("Juhee", 10);
		Stream_Operations_Obj_User u5 = new Stream_Operations_Obj_User("Charles", 35);
		Stream_Operations_Obj_User u6 = new Stream_Operations_Obj_User("Balaji", 30);

		Stream<Stream_Operations_Obj_User> stream = Stream.of(u1, u2, u3, u4, u5, u6);
		stream.filter(u -> u.age >= 18).forEach(u -> System.out.println(u));

	}
}
/*Output:
	Age greater than 18 people are : name=Shreyas age=25
	Age greater than 18 people are : name=vikas age=30
	Age greater than 18 people are : name=Charles age=35
	Age greater than 18 people are : name=Balaji age=30
*/