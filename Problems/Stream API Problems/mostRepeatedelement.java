package Arrays.Stream.example;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class mostRepeatedelement {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        System.out.println(
	       l.stream()
	       .collect(Collectors.groupingBy(e->e,Collectors.counting()))
	       .entrySet().stream()
	       .max(Map.Entry.comparingByValue()).get()
	       
        		);
        
        String n = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        String first = Arrays.stream(n.split("")).collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting()))
        .entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).findFirst().get();
        
        System.out.println(first);
        
        String f = Arrays.stream(n.split("")).collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst().get();
                
                System.out.println(f);
                
                String s = Arrays.stream(n.split("")).collect(Collectors.groupingBy(e->e,TreeMap::new,Collectors.counting()))
                        .entrySet().stream().map(e->e.getKey()).findFirst().get();
                        
                        System.out.println(s);
               System.out.println(Arrays.stream(n.split("")).collect(Collectors.groupingBy(e->e,TreeMap::new,Collectors.counting())));
                                

	}

}
