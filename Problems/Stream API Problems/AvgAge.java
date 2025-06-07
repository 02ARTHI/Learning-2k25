package KodeWala.Interview.questions;

import java.util.Arrays;
import java.util.List;

public class AvgAge {

	public static void main(String[] args) {
	List<Integer> num = Arrays.asList(1,4,5,6);
	Double n=num.stream().mapToInt(Integer::valueOf).average().getAsDouble();
	System.out.println(n);
	

	}

}
