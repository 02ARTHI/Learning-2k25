package Streams.mayLast;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExceptionHandleInStreams {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", null, "banana", "cherry");
		List<String> nonNullWords = words
		                          .stream()
		                          .filter(word -> {
		                              try {
		                                  return word != null && word.length() > 0;
		                              } catch (Exception e) {
		                                  // Handle the exception
		                                  return false;
		                              }
		                          })
		                          .collect(Collectors.toList());
	}

}
