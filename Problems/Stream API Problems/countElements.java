package Arrays.Stream.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countElements {

	public static void main(String[] args) {
		List<String> sentences = Arrays.asList(
				"Hello world",
				"Hello Java",
				"Java streams are powerful",
				"Streams in Java"
				);
				Map<String, Long> wordFrequency = sentences.stream()
				.flatMap(sentence -> Arrays.stream(sentence.toLowerCase().split("\\s+")))
				.collect(Collectors.groupingBy(
				Function.identity(),
				Collectors.counting()
				));
				System.out.println(wordFrequency);

	}

}
