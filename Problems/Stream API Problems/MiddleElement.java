package Arrays.Stream.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MiddleElement {

	public static void main(String[] args) {
		String c[] = { "wrn", "apa", "spa", "uji", "tjp", "brb", "tjp" };
		Map<Character,List<String>> n=Arrays.stream(c).collect(Collectors.groupingBy(e->e.charAt(e.length()/2),Collectors.toList()));
        System.out.println(n);
	}

}
