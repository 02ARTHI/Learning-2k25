package stream.problems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {
  public static void main(String[] args)
  {
	  List<String> names = new ArrayList<String>();
	  names.add("india");
	  names.add("usa");
	  names.add("russia");
	  names.add("china");
	  names.add("canada");
			  
		/*
		 * names.stream().limit(1).toList().forEach(v->System.out.println(v));
		 * names.stream().limit(10).toList().forEach(System.out::println);
		 * System.out.println(names);
		 */
	 
	  names.stream().skip(2).toList().forEach(System.out::println);
  }
}
