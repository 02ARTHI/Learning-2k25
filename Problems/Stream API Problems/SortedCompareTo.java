package stream.problems;

import java.util.Arrays;
import java.util.List;

public class SortedCompareTo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("arthi","arthi","charlie","pappu","julie");
		
		names.stream().sorted((e1,e2)-> e1.compareTo(e2)).forEach(System.out::print); // asc
		System.out.println();
		names.stream().sorted((e1,e2)-> e2.compareTo(e1)).forEach(System.out::print); // desc
		
		
	}

}
