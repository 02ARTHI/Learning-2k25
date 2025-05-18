package stream.problems;

import java.util.Arrays;
import java.util.List;

public class sortedPlusString {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("arthi","arthi","charlie","pappu","julie");
		
		names.stream().map(e->e+" welcome").forEach(System.out::println);
	}

}
