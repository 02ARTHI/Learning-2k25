package Streams.sunday;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondLarSmall {

	public static void main(String[] args) {
		List < Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
		
		Integer secSmall = nums.stream()
		.distinct()
		.sorted()
		.skip(1)
		.findFirst().get();
		
		System.out.println(secSmall); // second smallest
		
		Integer secLar = nums.stream()
				.distinct()
				.sorted((e1,e2)->e2.compareTo(e1))
				.skip(1)
				.findFirst().get();
		System.out.println(secLar); //second largest
	}

}
