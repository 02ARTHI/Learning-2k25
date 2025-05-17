package stream.problems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem3 {
  public static void main(String[] args)
  {
	  List<String> names = new ArrayList<String>();
	  names.add("india");
	  names.add("usa");
	  names.add("russia");
	  names.add("china");
	  names.add("canada");
			  
		names.stream().map(String::length).forEach(System.out::println);
		names.stream().map(v->v.toUpperCase()).forEach(System.out::println);
  }
}
