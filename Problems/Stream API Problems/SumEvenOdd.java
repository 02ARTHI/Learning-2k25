package Streams.sunday;

import java.util.Arrays;
import java.util.List;

public class SumEvenOdd {

	public static void main(String[] args) {
		List < Integer > numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,12, 14);

		int num=numbers.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
		System.out.println(num); // even
		
		int num1=numbers.stream().filter(n->n%2==1).mapToInt(Integer::intValue).sum();
		int num2=numbers.stream().filter(n->n%2!=1).mapToInt(Integer::intValue).sum();
		System.out.println(num1); // odd
	}

}
