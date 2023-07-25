package newprogrammingstring;

public class UsageOFStringMethods {
public static void main(String[] args) {
	String s="hello world";
	System.out.println(s.length());
	System.out.println(s.trim());
	System.out.println(s.substring(3));
	System.out.println(s.substring(0, 11));
	System.out.println(s.indexOf('l', 4));
	//System.out.println(reverse(s));
	String arr[]=s.split(" ");
	for(String a:arr)
		System.out.println(a);
	
}

}