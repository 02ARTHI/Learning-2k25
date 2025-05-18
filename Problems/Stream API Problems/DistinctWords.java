package stream.problems;

import java.util.Arrays;
import java.util.List;

public class DistinctWords {

	public static void main(String[] args) {
		 List<String> s = Arrays.asList(
	                "Java Stream API provides a fluent interface for processing sequences of elements.",
	                "It supports functional-style operations on streams of elements, such as map-reduce transformations.",
	                "In this exercise, you need to count the total number of words in all sentences."
	        );
		 long r=s.stream().flatMap(e->Arrays.stream(e.split("\\s+"))).map(String::toLowerCase).distinct().count();
		 System.out.println(r);
		 
		 
			/*
			 * split("\\s+") breaks each sentence into words using whitespace as a
			 * delimiter.
			 * 
			 * Arrays.stream(...) creates a stream of words from the split sentence.
			 * 
			 * .flatMap(...) ensures that instead of creating separate streams for each
			 * sentence, all words from all sentences are merged into a single stream.
			 * 
			 * Example Input: ["Java Stream API is powerful",
			 * "Stream API is useful for processing data"] 💡 After flatMap: ["Java",
			 * "Stream", "API", "is", "powerful", "Stream", "API", "is", "useful", "for",
			 * "processing", "data"]
			 */
	}

}
