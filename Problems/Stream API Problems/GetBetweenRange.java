package Arrays.Stream.example;

import java.util.stream.IntStream;

public class GetBetweenRange {

	public static void main(String[] args) {
		IntStream.rangeClosed(10, 100).filter(e->e%2==0).forEach(System.out::println);

	}

}
