package Arrays.Stream.example;

import java.util.Arrays;

public class onlyNumbers {

	public static void main(String[] args) {
		String n= "600002";
		
		boolean noneMatch = Arrays.stream(n.split("")).noneMatch(e->e.matches("[a-zA-Z]"));
		System.out.println(noneMatch);
	}

}
