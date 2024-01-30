package newPractice;

import java.util.Scanner;

public class CharacterCoversion {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a character");
	char ch=scan.next().charAt(0);
	if(ch>='A'&&ch<='Z')
	{
		char l=(char) (ch+32);
		System.out.println(l);
	}
	else if(ch>='a'&&ch<='z')
	{
		char u=(char)(ch-32);
		System.out.println(u);
	}
	else
		System.out.println("invalid char");
}
}
