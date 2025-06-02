package String.problems.may;

public class CountCharString {

	public static void main(String[] args) {
	
		String s="arthi";
		
		char f=s.charAt(0);
		int count=1;
		for(int i=1;i<s.length();i++)
		{
			if(f==s.charAt(i))
			{
				count++;
			}
		}
		System.out.println(s.length());
       System.out.println(count);
	}

}
