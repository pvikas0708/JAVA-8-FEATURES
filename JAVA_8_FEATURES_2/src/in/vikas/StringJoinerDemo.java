package in.vikas;

import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {

		StringJoiner sj1 = new StringJoiner("-");
		sj1.add("vikas");
		sj1.add("it");
		sj1.add("java");
		System.out.println(sj1); // Vikas-it-java
		// in normal String we have to do it with + operator

		StringJoiner sj2 = new StringJoiner("-", "(", ")");
		sj2.add("vikas");
		sj2.add("it");
		sj2.add("java");
		System.out.println(sj2); // (vikas-it-java) in bracket

	}

}
