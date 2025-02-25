package in.vikas;

import java.util.ArrayList;
import java.util.Collections;

public class NumbersSort1_withLambda {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(2);

		System.out.println("Before Sort :: " + al);

		//Collections.sort(al, (i, j) ->i.compareTo(j));//Sorts in Ascending order
		Collections.sort(al, (i, j) -> (i > j) ? -1 : 1);

		System.out.println("After Sort :: " + al);
	}

}
/*Output:
	Before Sort :: [5, 3, 4, 1, 2]
	After Sort :: [5, 4, 3, 2, 1]
*/