package newprogramming;

import java.util.Scanner;

public class ConvertUpperTOLowerAndLowerToUpper {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the character to convert");
		char ch=s.next().charAt(0);
		// difference is 32.if +32 upper to lower, -32 then lower to upper
		if(ch>='A'&&ch<='Z')
		{
			char l=(char)(ch+32);
			System.out.println(l);	
		}
		else if(ch>='a'&&ch<='z')
		{
			char u=(char)(ch-32);
			System.out.println(u);
		}
		else
			System.out.println("Invalid character");
			
	}

}
