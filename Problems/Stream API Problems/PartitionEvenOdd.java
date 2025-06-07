package Arrays.Stream.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEvenOdd {

	public static void main(String[] args) {
		List<Integer> n= Arrays.asList(1,2,3,4,5,6,7,7);
		
      Map<Boolean, List<Integer>>num=n.stream().collect(Collectors.partitioningBy(e->e%2==0));
      
      num.forEach((k,v)->System.out.println(k+" - "+v));
	}

}
