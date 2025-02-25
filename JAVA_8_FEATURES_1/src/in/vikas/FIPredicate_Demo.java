package in.vikas;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class FIPredicate_Demo {

	public static void main(String[] args) {
		System.out.println("==================Predicate==================");
		// with predicate interface
		Predicate<Integer> p = i -> i > 10;
		System.out.println(p.test(5)); //One input
		System.out.println(p.test(15));

		System.out.println("==================BiPredicate==================");
		BiPredicate<Integer, Integer> bip = (i, j) -> (i + j) >= 20;
		System.out.println(bip.test(2, 3));//Two input => Accepts max two inputs only not more
		System.out.println(bip.test(5, 5));
	}

}
/*Output:
==================Predicate==================
false
true
==================BiPredicate==================
false
false
*/
