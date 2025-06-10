package String.problems.example;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurrencesOfEachWord {

	public static void main(String[] args) {
		 String input = "Java Stream API provides Stream functionality with Stream operations";
		 
		 Map<Object, Long> n=Arrays.stream(input.split("\\s+")).collect(Collectors.groupingBy(e->e,Collectors.counting()));
         n.forEach((k,v)->{
        	 System.out.println(k+" "+v);
         });
         
         Map<Object, Long> n1=Arrays.stream(input.split("")).collect(Collectors.groupingBy(e->e,Collectors.counting()));
         n1.forEach((k,v)->{
        	 System.out.println(k+" "+v);
         });
	}

}
