package stream.problems;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class SquareNumber {

	
	
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
	        // Write your code here
	        List<Integer>  n1=numbers.stream().map(n->n*n).toList();
	        
	        System.out.println(n1); // number square
	        
	        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
	        // Write your code here
	        
	        Integer r=names
	        .stream()
            .map(e -> e.length())
            .max((integer, newInteger) -> Integer.compare(integer, newInteger))
            .get();
	        
	        Integer r1=names.stream()
            .map(String::length) // Convert names to their lengths
            .max(Comparator.naturalOrder()) // Find the max length
            .orElse(0);
	        
	        System.out.println(r);
	        System.out.println(r1);
	}
}
