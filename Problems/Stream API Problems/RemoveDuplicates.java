package KodeWala.Interview.questions;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> s = Arrays.asList(1, 4, 5, 6, 1, 2, 3, 5, 6, 7, 8, 9);

		List n = s.stream().distinct().toList();
		System.out.println(n);
	}

}
