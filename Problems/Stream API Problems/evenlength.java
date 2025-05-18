package stream.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class evenlength {

	public static void main(String[] args) {
		 List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
	        // Write your code here
		 
		 String s=words
           .stream()
           .filter(e->e.length()%2==0)
           .limit(2)
           .collect(Collectors.joining());
          //Use Stream API to find the concatenation of the first two words that have even lengths.
		 System.out.println(s);
	}

}
