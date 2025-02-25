package in.vikas;

import java.util.ArrayList;

public class NumbersSort1_ForEach {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(2);

		System.out.println("=================For Loop=================");

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("===============For EachLoop===============");
		for (int i : al) {
			System.out.println(i);
		}

		System.out.println("=================For Each=================");

		al.forEach(i -> System.out.println(i));
	}

}
