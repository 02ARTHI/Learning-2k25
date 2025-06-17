package Arrays.Stream.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Squares {

	public static void main(String[] args) {
		List<Integer> n= Arrays.asList(1,4,5,7,8,2);
         List<Integer>s=n.stream().map(e->e*e).collect(Collectors.toList());
         System.out.println(s);
         
         List<Integer> num= Arrays.asList(1,2,3,4,5,6,8,9,9,10);
         List<Integer> m=num.stream().distinct().filter(e->e%2!=0).toList();
         System.out.println(m);
         int small=3;
         int ele=num.stream().sorted().skip(small-1).findFirst().get();
         System.out.println(ele);
         System.out.println("----------------------------------");
         
         List<Integer> num1= Arrays.asList(1,2,3,4,5);
         List<Integer> num2= Arrays.asList(5,6,7,8);
         
         List<Integer> nums=Stream.concat(num1.stream(),num2.stream()).toList();
         System.out.println(nums);
         
         List<Integer> intersection=num1.stream().filter(num2::contains).toList();
         System.out.println(intersection);
	}

}
