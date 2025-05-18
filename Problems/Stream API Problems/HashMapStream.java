package stream.problems;

import java.util.HashMap;

public class HashMapStream {
	public static void main(String[] args) {
	 HashMap<String, Integer> hs= new HashMap<String, Integer>();
	 hs.put("arthi",90000);
	 hs.put("dileep",70000);
	 hs.put("latha",100000);
	 
	 hs.keySet().stream().sorted((e1,e2)->e2.compareTo(e1)).forEach(System.out::println);
	 
	}
}
