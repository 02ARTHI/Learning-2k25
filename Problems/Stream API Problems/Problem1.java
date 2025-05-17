package stream.problems;
import java.util.Arrays;
import java.util.List;

public class Problem1 {
  public static void main(String[] args)
  {
	  List<String> names = Arrays.asList("arthi","arthi","charlie","pappu","julie");
	  
	  names = names.stream().distinct().toList();
	  
	  names.stream().distinct().forEach(System.out::println);
	  
	  names.stream().distinct().forEach(v->System.out.println(v));
	 
	  System.out.println(names);
  }
}
