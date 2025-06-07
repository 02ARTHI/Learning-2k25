package KodeWala.Interview.questions;

import java.util.Arrays;
import java.util.List;

public class Containsprime {

	public static void main(String[] args) {
		List<Integer> num= Arrays.asList(4,6,10,8);
	
		Boolean n=num.stream().anyMatch(Containsprime::isprime);
		System.out.println(n);
	}
	
	public static boolean isprime(int ns)
	{
		if(ns<2)
			return false;
		for(int i=2;i<=Math.sqrt(ns);i++)
		{
			if(ns%i==0)
				return false;
		}
		
		return true;
	}

}
