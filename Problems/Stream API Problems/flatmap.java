package Streams.mayLast;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatmap {

	public static void main(String[] args) {
		List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2), 
                Arrays.asList(3, 4));
listOfLists.stream()
         .flatMap(List::stream)
         .collect(Collectors.toList()).forEach(System.out::println);;

	}

}
