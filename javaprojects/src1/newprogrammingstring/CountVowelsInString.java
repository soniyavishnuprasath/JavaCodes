package newprogrammingstring;

public class CountVowelsInString {
public static void main(String[] args) {
	String s="soniya";
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		char l=s.charAt(i);
		if(l=='a'||l=='e'||l=='i'||l=='i'||l=='o')
		{
			count++;
			System.out.println(l);
		}
		
	}
	System.out.println(count);
}
}
