package KodeWala.Interview.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringList {

	public static void main(String[] args) {
		List<String> s= Arrays.asList("arthi","pappukutty","charlie","dileep","julie");
		
           Optional<String> n=  s.stream().max(Comparator.comparing(String::length));
           n.ifPresent(System.out::println);
           
	}

}
