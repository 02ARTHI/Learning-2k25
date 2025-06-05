package Arrays.Stream.example;

import java.util.Arrays;
import java.util.List;

public class CalSumandAvg {

	public static void main(String[] args) {
		List<Integer> n= Arrays.asList(1,2,4,5,88,44,34,25,67,86);
		int res=n.stream().mapToInt(Integer::valueOf).sum();
		Double s=n.stream().mapToInt(Integer::valueOf).average().getAsDouble();
		System.out.println(s); //avg
		System.out.println(res); //sum
		System.out.println(n.stream().mapToInt(Integer::valueOf).min().getAsInt()); //min
		System.out.println(n.stream().mapToInt(Integer::valueOf).max().getAsInt()); //max
		
		System.out.println();
		
		
		int[] num= new int[] {1,2,4,5,88,44,34,25,67,86};
		long sum = Arrays.stream(num).sum();
		Double sum1 = Arrays.stream(num).average().getAsDouble();
		System.out.println(sum); //sum
		System.out.println(sum1); // avg
		
	     System.out.println(Arrays.stream(num).min().getAsInt());//min
	     System.out.println(Arrays.stream(num).max().getAsInt());//max

	}

}
