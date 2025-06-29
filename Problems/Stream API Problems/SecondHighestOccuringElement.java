package Arrays.Stream.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondHighestOccuringElement {

	public static void main(String[] args) {
		String st = "secondses"; 
		Optional<Character> secondMax = st.chars() 
				.mapToObj(c -> (char) c) 
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet() 
				.stream() 
				.sorted(Map.Entry.<Character, Long>comparingByValue()
						.reversed()) 
				.skip(1) // skip the first (most frequent) 
				.map(Map.Entry::getKey) 
				.findFirst(); // get the second highest 
		
		secondMax.ifPresentOrElse( c -> System.out.println("Second most repeated character: " + c), () -> System.out.println("No second most frequent character found") );


        Optional<Map.Entry<String, Long>> secondHighest = Arrays.stream(st.split(""))
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
            .skip(1)// skip the highest
            .findFirst(); 
        
       String second= Arrays.stream(st.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
                .skip(1)
                .map(Map.Entry::getKey)// skip the highest
                .findFirst().get(); 
        
        System.out.println(secondHighest);
        System.out.println(second);
		
		
	}

}
