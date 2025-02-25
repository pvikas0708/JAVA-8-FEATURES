package in.vikas;

import java.util.Arrays;

public class SumOfNumbers {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5 };

		// Approach-1
		int sum = 0;
		for (int i : nums) {
			sum = sum + i;
		}
		System.out.println(sum);

		// Approach-2
		int reduce = Arrays.stream(nums).reduce(0, (a, b) -> a + b);
		System.out.println(reduce);

	}
}
