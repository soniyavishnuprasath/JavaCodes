package newprogrammingstring;

public class CountTheDifferentChar {
public static void main(String[] args) {
	String s="21379fdnewkbrd4wFEVBJT%$#@!";
	int up=0,lc=0,num=0,sc=0;
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch>='A'&&ch<='Z')
			up++;
		else if(ch>='a'&&ch<='z')
			lc++;
		else if(ch>='0'&&ch<='9')
			num++;
		else 
			sc++;
	}
	System.out.println(up);
	System.out.println(lc);
	System.out.println(num);
	System.out.println(sc);
}
}
