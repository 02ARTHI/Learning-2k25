package KodeWala.Interview.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("arthi", "arthi", "charlie", "pappukutty", "julie");
		String str = names.stream().sorted(Comparator.comparingInt(String::length).reversed()).findFirst().get(); // one
																													// way
		System.out.println(str);

		String s = names.stream().max(Comparator.comparingInt(String::length)).orElse("nothing"); // second approach
		System.out.println(s);
		int n=4;
		names.stream().filter(e->e.replaceAll("[^aeiouAEIOU]", "").length()==n).forEach(System.out::println);

	}

}
