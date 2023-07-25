package newprogramming;

import java.util.Scanner;

public class VowelOrConsonent {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the character to check the charecter is vowel or consonent");
		char ch=s.next().charAt(0);
		if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
		{		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
			System.out.println(ch+ " is a vowel");
		else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			System.out.println(ch+ " is a vowel");
		else
			System.out.println(ch+" is consonent");
		}
		else
		{
			System.out.println(ch+" is invalid character");
		}
		
	}

}
