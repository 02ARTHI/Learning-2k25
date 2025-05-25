package Streams.mayLast;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StringExample {
 
	public static void main(String[] args) {
	List<String> names = Arrays.asList("John", "Alice", "Bob", "Jane");
	Map<Integer, List<String>> groupedByLength = names
	                          .stream()
	                          .collect(Collectors.groupingBy(String::length));
	
	for (Entry<Integer, List<String>> i : groupedByLength.entrySet()) 
        System.out.println("Key = " + i.getKey() +
                         ", Value = " + i.getValue());
	
	}
}
