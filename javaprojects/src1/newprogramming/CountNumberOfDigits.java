package newprogramming;

import java.util.Scanner;

public class CountNumberOfDigits {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int count=0,temp=n;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		System.out.println("number of digits in "+temp+" is "+count);
	}

}
