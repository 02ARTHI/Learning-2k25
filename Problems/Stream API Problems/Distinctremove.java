package Arrays.Stream.example;

import java.util.Arrays;
import java.util.List;

public class Distinctremove {

	public static void main(String[] args) {
		List<Integer> n= Arrays.asList(1,2,4,5,88,44,34,51,25,67,86,99,99,2,1,0,0);
		n.stream().distinct().forEach(System.out::println);
		
		System.out.println("----------------");
		
		int str1=n.stream().mapToInt(e->e*e).sum();
		System.out.println("----------------"+str1);
		int[] num= new int[] {1,2,4,5,88,44,34,25,67,86,99,99,2,1,0,0};
        Arrays.stream(num).distinct().forEach(System.out::println);
        System.out.println("----------------");
        Long str=Arrays.stream(num).mapToLong(e->e*e).sum();
        System.out.println(str);
        
        System.out.println("----------------");
        
        System.out.println(n.stream().filter(e->e>50).findFirst().get());
       System.out.println(Arrays.stream(num).filter(e->e>50).findFirst().getAsInt());
	}

}
