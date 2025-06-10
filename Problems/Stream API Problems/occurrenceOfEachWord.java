package String.problems.example;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class occurrenceOfEachWord {

	public static void main(String[] args) {
		String s= "arthiar";
		
		Map<Object, Long> n=Arrays.stream(s.split("")).collect(Collectors.groupingBy(e->e,Collectors.counting()));
		 n.forEach((k,v)->{
	        	System.out.println(k+" "+v);
	        });
	}

}
