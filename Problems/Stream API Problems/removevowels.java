package String.problems.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class removevowels {

	public static void main(String[] args) {
		String s="helllo arthi";
		
		String n=Arrays.stream(s.split("")).filter(c->!"aeiouAEIOU".contains(c)).collect(Collectors.joining());
         System.out.println(n);
	}

}
