package Streams.sunday;

import java.util.Arrays;
import java.util.List;

public class StringStartsWith {

	public static void main(String[] args) {
		 List < String > colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
		    char c='B';
		 colors.stream()
		 .filter(s->s.startsWith(String.valueOf(c)))
		 .forEach(System.out::println);
	}

}
