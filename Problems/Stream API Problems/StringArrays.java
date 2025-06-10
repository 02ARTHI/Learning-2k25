package String.problems.example;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StringArrays {

	public static void main(String[] args) {
		String s= "Hi this is Arthi. this is an test class";
		
		Map<String,Long> n=Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(e->e,Collectors.counting()));
		
        n.forEach((k,v)->{
        	System.out.println(k+" "+v);
        });
        
        Arrays.stream(s.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]", "").length()==1)
        .forEach(System.out::println);
	}

}
