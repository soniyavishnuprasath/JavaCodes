package newprogramming;

import java.util.Scanner;

public class GreatestDigitsInNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int max=0,temp=n;
		while(n!=0)
		{
			int k=n%10;
			if(k>max)
			{
				max=k;
			}
			n=n/10;
		}
		System.out.println("greatest digit in "+temp+" is "+max);
	}

}
