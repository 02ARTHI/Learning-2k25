package Arrays.Stream.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ProductOfAll {

	public static void main(String[] args) {
	  int[] num= new int[] {1,3,4,5,2};
	  
	  System.out.println(Arrays.stream(num).boxed().reduce((a,b)->a*b).get());
	  
	  Arrays.stream(num).boxed().collect(Collectors.partitioningBy(e->e%2==0)).forEach((k,v)->{
		  System.out.println(k+" = "+v);
	  });

	}

}
