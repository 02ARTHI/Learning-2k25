package Streams.sunday;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToLowerCase {

	public static void main(String[] args) {
		List < String > colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
		
		 colors.stream().map(String::toUpperCase).forEach(System.out::println); //one way
		
		 colors.stream().map(String::toUpperCase).collect(Collectors.toList()); // another way
	}

}
