package newprogramming;

import java.util.Scanner;

public class SumOfEvenDigitsInNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int sum=0,temp=n;
		while(n!=0)
		{
			int k=n%10;
			if(k%2==0)
			{
				sum=sum+k;
			}
			n=n/10;
		}
		System.out.println("sum of even number in "+temp+" is "+sum);
	}
}
