/*write a java program to convert string into character array*/


package part3java;

public class StringEx3 {
	public static void main(String[] args) {
		String s="Apple";
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			System.out.println(ch);
		}
	}

}
