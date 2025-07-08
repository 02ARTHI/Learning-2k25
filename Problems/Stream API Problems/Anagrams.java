package Arrays.Stream.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Anagrams {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("listen", "silent", "enlist", "google", "elbow", "below");
        
		System.out.println(
		words.stream()
		.collect(Collectors.groupingBy(e->
		Arrays.stream(e.split(""))
		.sorted()
		.collect(Collectors.joining()))).entrySet().stream().map(s->s.getValue()).toList()
		
         );
	}

}
