package practice;

public class StringReverse {
	public static void main(String[] args) {
		String s[]=new String[5];
		s[0]="hello";
		s[1]="everyone";
		s[2]="good morning";
		s[3]="have a";
		s[4]="nice day";
		for(int i=(s.length-1);i>=0;i--)
		{
			System.out.println(s[i]);
		}
	}

}
