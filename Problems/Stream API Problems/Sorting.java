package Streams.mayLast;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		List<String> s= Arrays.asList("africa","dubai","india","asia","japan","america","russia");
		s.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println); // by length
		System.out.println("---------------");
s.stream().sorted((e1,e2)->((Integer)e2.length()).compareTo(e1.length())).forEach(System.out::println); //by own logic to sort
	
s.stream().sorted((e1,e2)->e2.compareTo(e1)).forEach(System.out::println); //by alphabets
String str=s.stream().max(Comparator.comparing(String::length)).get();
System.out.println(str);
System.out.println("---------------");
s.stream().filter(e->e.matches(".*[aeiou].*")).forEach(System.out::println);
	}

}
