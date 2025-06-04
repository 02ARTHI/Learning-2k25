package Streams.mayLast;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NullClass {

	public static void main(String[] args) {
		List<String> s = Arrays.asList("africa", "dubai", "india", "asia", "japan", "america", "russia", " ", null);
		s.stream().filter(e -> e != null && (!e.isEmpty())).forEach(System.out::println);

		System.out.println("--------------");
		
		Map<Character,List<String>> str=s.stream().collect(Collectors.groupingBy(e->e.charAt(0)));
   str.forEach((key,value)-> {
	         System.out.println(key);
		   value.forEach(System.out::println);
		   });
	}

}
