package KodeWala.Interview.questions;

import java.util.Arrays;

public class KthSmallest {

	public static void main(String[] args) {
		int[] numbers = {7, 2, 9, 4, 1, 5, 6};
		int k=3;
		int n=Arrays.stream(numbers).boxed().sorted().skip(k-1).findFirst().get();
		System.out.println(n);
	}

}
