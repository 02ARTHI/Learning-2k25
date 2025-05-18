package stream.problems;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(9,4,3,8,6,2,7,0,3,4,5,6);
		
		nums.stream().parallel().sorted().forEachOrdered(System.out::print); // in an order
		
		System.out.println();
		nums.stream().parallel().sorted().forEach(System.out::print); // random order
	
	}

}
