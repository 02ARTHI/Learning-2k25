package Streams.sunday;

import java.util.HashMap;
import java.util.Map;

public class HasmapValueExample {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		hm.put("C Viyan", 100);
		hm.put("A Kavin", 200);
		hm.put("B Iyal", 300);
		hm.put("D Pari", 123);
		
		hm
		.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
	}

}
