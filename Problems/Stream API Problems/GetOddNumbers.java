package Arrays.Stream.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GetOddNumbers {

	public static void main(String[] args) {
		List<Integer> n= Arrays.asList(1,2,4,5,88,44,34,25,67,86);
		n.stream().filter(e->e%2==0).forEach(System.out::println);
		
		System.out.println();
		int[] num= new int[] {1,2,4,5,88,44,34,25,67,86};
		Arrays.stream(num).filter(e->e%2==0).forEach(System.out::println); 
		
		System.out.println("----------------");
		
		n.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("----------------");
		
		Arrays.stream(num)
		//.boxed()
		.mapToObj(ns->Integer.valueOf(ns))
		//.mapToObj(Integer::valueOf)
		.sorted(Comparator.reverseOrder()).forEach(System.out::println); 

	}

}
