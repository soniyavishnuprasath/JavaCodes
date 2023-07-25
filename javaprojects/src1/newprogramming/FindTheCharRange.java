package newprogramming;
//WAJP to check the given character is alphabet or number or special character
import java.util.Scanner;

public class FindTheCharRange {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the charecter to check the range");
		//A=65 to Z=90 ,a=97 to z=122, 0=48 to 9=57
		char ch=s.next().charAt(0);
		if(ch>='A'&&ch<='Z')
			System.out.println(ch+" is uppercase alphabet");
		else if(ch>='a'&&ch<='z')
			System.out.println(ch+" is lowercase alphabet");
		else if(ch>='0'&&ch<='9')
			System.out.println(ch+" is number");
		else
			System.out.println(ch+" is a special character");
	}

}
