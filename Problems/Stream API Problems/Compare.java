package Streams.mayLast;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Compare {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Alice", "Bob", "Jane");
		
		//names.stream().sorted().forEach(System.out::println);
		
		//names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		//names.stream().sorted((e1,e2)->e2.compareTo(e1)).forEach(System.out::println);
		names.stream().sorted((e1,e2)->e1.compareTo(e2)).forEach(System.out::println);
		
		/*
		 * names.stream()
		 * .sorted(Comparator.naturalOrder().thenComparing(Comparator.comparing(String::
		 * length))).forEach(System.out::println);
		 * 
		 */

	
	}

}
