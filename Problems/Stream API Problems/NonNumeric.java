package Arrays.Stream.example;

import java.util.Arrays;
import java.util.List;

public class NonNumeric {

	public static void main(String[] args) {
		List<String> list= Arrays.asList("a12erf","45rtgf45","yu864gh3");
		
		List<String> list1=list.stream().map(e->e.replaceAll("[^0-9]", "")).toList();
System.out.println(list1);

List<String> list2=list.stream().map(e->e.replaceAll("[^a-z]", "")).toList();
System.out.println(list2);

List<String> list3=list.stream().map(e->e.replaceAll("[^aeiou]", "")).toList();
System.out.println(list3);

List<String> list4= Arrays.asList("123","abc","123abc");

List<String> list5=list4.stream().filter(e->e.matches("[0-9]+")).toList();

System.out.println(list5);

	}

}
