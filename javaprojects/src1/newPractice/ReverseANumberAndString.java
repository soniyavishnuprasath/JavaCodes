package newPractice;

public class ReverseANumberAndString {
public static void main(String[] args) {
	/*
	 * int n=1234,rev=0; while(n!=0) { int k=n%10; rev=rev*10+k; n=n/10; }
	 * System.out.println("reversed number is "+rev);
	 */
	String str="hello",rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
}
}
