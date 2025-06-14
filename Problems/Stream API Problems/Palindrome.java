package KodeWala.Interview.questions;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {
		String s="mada";
		
		Boolean isPalindrome=IntStream.range(0, s.length()/2).allMatch(i->s.charAt(i)==s.charAt(s.length()-1-i));
        System.out.println(isPalindrome);
        
        Optional<String> nv=Arrays.stream(s.split("")).filter(c->s.indexOf(c)==s.lastIndexOf(c)).findFirst();
        System.out.println(nv.get());
	}

}
