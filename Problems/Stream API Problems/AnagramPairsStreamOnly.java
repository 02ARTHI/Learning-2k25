package Arrays.Stream.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class AnagramPairsStreamOnly {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("listen", "silent", "enlist", "rat", "tar", "art", "evil", "vile", "live", "veil", "stone");

        // Step 1: Group words by their sorted character signature
        Collection<List<String>> grouped = words.stream()
            .collect(Collectors.groupingBy(
                word -> word.chars()
                            .sorted()
                            .mapToObj(c -> String.valueOf((char) c))
                            .collect(Collectors.joining()),
                LinkedHashMap::new,
                Collectors.toList()
            ))
            .values();

        // Step 2: Extract one pair per group using streams
        List<List<String>> pairs = grouped.stream()
            .filter(group -> group.size() >= 2)
            .map(group -> group.subList(0, 2)) // take only one pair
            .collect(Collectors.toList());

        // Step 3: Print the pairs
        pairs.forEach(pair -> System.out.println(pair.get(0) + " ↔ " + pair.get(1)));
        
        String str="arthiar"; 
        List<Character> list=str.chars().distinct().mapToObj(c->(char)c).collect(Collectors.toList());
        System.out.println(list);
    }

	}


