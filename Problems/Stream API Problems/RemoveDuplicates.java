package KodeWala.Interview.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> s = Arrays.asList(1, 4, 5, 6, 1, 2, 3, 5, 6, 7, 8, 9);

		List n = s.stream().distinct().toList();
		System.out.println(n);
		
		int[] a= new int[]{1, 4, 5,1};
		Set<Integer> seen = new HashSet<>();
		boolean match = Arrays.stream(a).anyMatch(e -> !seen.add(e));
		System.out.println(match);
	}

}
