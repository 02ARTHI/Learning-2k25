package KodeWala.Interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoList {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10,9);

        List n=Stream.concat(list1.stream(), list2.stream()).sorted().toList();
        System.out.println(n);
        
        List intersection=list1.stream().filter(list2::contains).toList();
        System.out.println(intersection);
	}

}
