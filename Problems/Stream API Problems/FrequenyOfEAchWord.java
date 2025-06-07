package KodeWala.Interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequenyOfEAchWord {

	
	public static void main(String[] args)
	{
		List<String> s = Arrays.asList(
                "Java Stream API provides a fluent interface for processing sequences of elements",
                "It supports functional-style operations on streams of elements such as map-reduce transformations",
                "In this exercise you need to count the total number of words in all sentences"
        );
		
		Map<Object, Long> nums=s.stream().flatMap(e->Arrays.stream(e.split("\\s+"))).map(e->e.toLowerCase())
		.collect(Collectors.groupingBy(word->word,Collectors.counting()));
		
		nums.forEach((k,v)->System.out.println(k+" - "+v));
		
	}
}
