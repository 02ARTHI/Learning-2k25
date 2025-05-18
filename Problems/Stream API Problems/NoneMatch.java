package Streams.sunday;

import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class NoneMatch {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		hm.put("Viyan", 100);
		hm.put("Kavin", 200);
		hm.put("Iyal", 300);
		hm.put("Pari", 123);	
		
		
		Set<String> l = hm
		.keySet()
		.stream()
		.collect(Collectors.toSet()); 
		System.out.println(l);
		
	boolean result = l
		.stream()
		.anyMatch(name -> name.endsWith("n"));
	System.out.println(result);

	}

}
