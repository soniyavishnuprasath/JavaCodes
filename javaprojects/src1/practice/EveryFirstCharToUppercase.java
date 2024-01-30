package practice;

public class EveryFirstCharToUppercase {
public static void main(String[] args) {
	String str="nutrients. cucumbers are packed with them in just a single cup of cucumber slices";
	String word[]=str.split(" "),totStr="";
	for(String each:word)
	{
		String oneStr="",rChar="";
		char fChar=0;
		for(int j=0;j<each.length();j++)
		{
			if(j==0)
			{
				fChar=(char)(each.charAt(j)-32);
			}
			if(j>0&&j<each.length())
			{
				rChar=rChar+each.charAt(j);
			}
		}
		oneStr=fChar+rChar;
		totStr=totStr+oneStr+" ";
	}
	System.out.println(totStr);
}
}
