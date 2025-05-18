package Streams.sunday;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageNum {

	public static void main(String[] args) {
		List<Integer> strings = Arrays
	              .asList(4,2,4,4,6,8,8,8,2);
		
		Double num=strings.stream()
		.mapToDouble(Integer::doubleValue)
		.average().getAsDouble();
		
		System.out.println(num);
		
	}

}
