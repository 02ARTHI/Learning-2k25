package String.problems.may;

public class CountCharAtString {

	public static void main(String[] args) {
		String s="arthiar";
		
		char f='t';
		int count=0;
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
