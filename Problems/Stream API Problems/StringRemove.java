package Streams.mayLast;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringRemove {

	public static void main(String[] args) {
		List<String> s= Arrays.asList("arthi","acharlie","julie","pappu","rsy");
		//s.stream().filter(e->!e.contains("ie")).forEach(System.out::println);
    String string = s.stream().filter(e->e.startsWith("a")).findFirst().get();
    //System.out.println(string);
    
    //s.stream().map(e->e.length()).forEach(System.out::println); //ascending
    
   // s.stream().map(e->e.length()).sorted(Comparator.reverseOrder()).forEach(System.out::println); // reverse
  //  s.stream().map(e->e.length()).sorted((e1,e2)->e2.compareTo(e1)).forEach(System.out::println); //reverse
	//s.stream().sorted((e1,e2)->((Integer)e1.length()).compareTo(e2.length())).forEach(System.out::println); //asce
	s.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println); //desc
	String str=s.stream().max(Comparator.comparing(String::length)).get();
	System.out.println(str);
	
	s.stream().max(Comparator.comparing(String::length)).ifPresent(Str->System.out.println(str.toLowerCase()));
	s.stream().filter(e->e.matches(".*[aeiou].*")).forEach(System.out::println); // string which has vowels
	
	
	String obj=s.stream().collect(Collectors.joining(","));
	System.out.println(obj);
	
	s.stream().map(e-> new StringBuilder(e).reverse()).forEach(System.out::println);
	}

}
