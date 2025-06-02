package String.problems.may;

public class VowelsCount {

	public static void main(String[] args) {
		String s="arth";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':count++;

			}
		}
		
		System.out.println(count);

	}

}
