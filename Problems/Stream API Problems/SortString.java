package Streams.sunday;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortString {

	public static void main(String[] args) {
		List < String > colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
	 colors.stream()
	 .sorted((e1,e2)->e2.compareTo(e1))
	 .forEach(v->System.out.println(v));
	 
	 colors.stream()
     .sorted(Comparator.reverseOrder())
     .collect(Collectors.toList());
	 
	}

}
