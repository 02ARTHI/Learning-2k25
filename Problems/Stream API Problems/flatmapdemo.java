package Arrays.Stream.example;

import java.util.Arrays;
import java.util.List;

public class flatmapdemo {

	public static void main(String[] args) {
		List<List<Integer>> num = Arrays.asList(
			
			 Arrays.asList(1,2,3,4),
			 Arrays.asList(5,6,7,8)
		);
		
		System.out.println(num.stream().flatMap(e->e.stream()).reduce((a,b)->a+b).get());//sum
		
		System.out.println("-----------------------------");
		
		int[][] nums= new int[][] {{1,2},{3,4},{5,6}};
		int n=Arrays.stream(nums).flatMapToInt(e->Arrays.stream(e)).sum();
		System.out.println(n);
		

	}

}
