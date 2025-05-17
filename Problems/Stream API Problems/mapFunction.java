package stream.problems;

import java.util.Arrays;
import java.util.List;

public class mapFunction {

	public static void main(String[] args) {
		
		
		List<Integer> nums =Arrays.asList(1,2,4,8,4,5);
		
		nums.stream().filter(n->n%2==1).map(n->n*2).forEach(System.out::println);
		
		int result= nums.stream().filter(n->n%2==1).map(n->n*2).reduce(0,(c,e)->(c+e));
		System.out.println("result: "+result);
		
		long c=nums.stream().count();
		System.out.println(c);
		
		nums=nums.stream().distinct().toList();
		nums.forEach(System.out::println);
		nums.forEach(System.out::println);
		
	}

}
