package Streams.mayLast;

import java.util.Arrays;
import java.util.List;

public class NullClass {

	public static void main(String[] args) {
		List<String> s= Arrays.asList("africa","dubai","india","asia","japan","america","russia"," ",null);
		s.stream().filter(e->e!=null&& (!e.isEmpty())).forEach(System.out::println);

	}

}
