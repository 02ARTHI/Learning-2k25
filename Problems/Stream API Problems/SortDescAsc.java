package stream.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SortDescAsc {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(9,4,3,8,6,2,7,0,3,4,5,6);
		Integer n12 = nums.stream().max((e1,e2)->e1.compareTo(e2)).get(); //max
		Integer m = nums.stream().min((e1,e2)->e1.compareTo(e2)).get(); //min
		
		System.out.println(n12);
		System.out.println(m);
		
		Optional<Integer> res=nums.stream().reduce((e1,e2)->e1+e2);
		System.out.println(res.get());
		nums.stream().distinct().sorted(Comparator.reverseOrder()).forEach(v->System.out.print(v));
		
		System.out.println();
		
		 List<String> names = Arrays.asList("arthi","arthi","charlie","pappu","julie");
		 List<String> n =names.stream().sorted((e1,e2)-> -5).toList(); // desc
		 List<String> n1 =names.stream().sorted().toList(); // asc
		 System.out.println(n1);
		 
		
	}

}
