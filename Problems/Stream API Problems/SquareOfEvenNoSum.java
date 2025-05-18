package stream.problems;

import java.util.Arrays;
import java.util.List;

public class SquareOfEvenNoSum {

	public static void main(String[] args) {
		  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	        // Write your code here
		  
		 Integer num= numbers
		  .stream()
		  .mapToInt(n->n*n)
		  .filter(e->e%2==0)
		  .sum();
		// Use Stream API to find the sum of the squares of even numbers in the list.
		 System.out.println(num);
		 
		 
			/*
			 * Use map() when transforming into objects like List<Integer>.
			 * 
			 * Use mapToInt() when working strictly with numeric operations, especially when
			 * calculating sum, max, average, etc.
			 */
		 }

}
