package Streams.sunday;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MaxMinn {

	public static void main(String[] args) {
		List < Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
		   
		int n=nums.stream()
		.mapToInt(Integer::intValue)
		.min().getAsInt();
		
		System.out.println(n);
		
		int n1=nums.stream()
				.mapToInt(Integer::intValue)
				.max().getAsInt();
				
				System.out.println(n1);
	}

}
