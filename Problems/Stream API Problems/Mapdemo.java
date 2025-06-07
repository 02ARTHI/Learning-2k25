package Arrays.Stream.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapdemo {

	public static void main(String[] args) {
	List<Integer> nums= Arrays.asList(1,2,3,4,5);
	
	nums.stream().collect(Collectors.toMap(num->num, value->value*value)).forEach((k,v)->{
		
		System.out.println(k+" = "+v);
	});

	
	int[] num= new int[] {1,2,3,4};
	
	Arrays.stream(num).boxed().collect(Collectors.toMap(ne->ne, value->value*value)).forEach((k,v)->{
		
		System.out.println(k+" = "+v);
	});
	
	}

}
