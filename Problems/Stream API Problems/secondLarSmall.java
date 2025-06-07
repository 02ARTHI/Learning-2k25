package Arrays.Stream.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class secondLarSmall {

	public static void main(String[] args) {
		List<Integer> n= Arrays.asList(1,2,4,5,88,44,34,51,25,67,86,99,2);
		
		System.out.println(n.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
		Optional<Integer> nt=n.stream().sorted().skip(1).findFirst();
		if(nt.isPresent())
			System.out.println(nt.get());
		System.out.println("----------------");
		
		int[] num= new int[] {1,2,4,5,88,44,34,25,67,86,99,2,1,0};
		System.out.println(Arrays.stream(num).mapToObj(ns->Integer.valueOf(ns)).sorted().skip(1).findFirst().get());
	}

}
