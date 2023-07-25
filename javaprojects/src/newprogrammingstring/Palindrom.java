package newprogrammingstring;

public class Palindrom {
	public static void main(String[] args) {
		String s="madam",rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
			System.out.println("its a palindrom string");
		else
			System.out.println("not an palindrom string");
	}

}
