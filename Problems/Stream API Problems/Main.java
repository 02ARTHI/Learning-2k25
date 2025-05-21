package stream.day1;



import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) {
        List<String> numbers = List.of("10", "20", "30", "40");

        // Convert to `IntStream`
        IntStream intStream = numbers.stream()
                                     .mapToInt(Integer::parseInt);
        System.out.print("IntStream: ");
        intStream.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Convert to `LongStream`
        LongStream longStream = numbers.stream()
                                       .mapToLong(Long::parseLong);
        System.out.print("LongStream: ");
        longStream.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Convert to `DoubleStream`
        DoubleStream doubleStream = numbers.stream()
                                           .mapToDouble(Double::parseDouble);
        System.out.print("DoubleStream: ");
        doubleStream.forEach(n -> System.out.print(n + " "));
    }
}