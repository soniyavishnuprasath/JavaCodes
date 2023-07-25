package newprogramming;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int temp=n,sum=0;
		while(n!=0)
		{
			int k=n%10;
			sum=sum+k;
			n=n/10;
		}
		System.out.println("sum of given digits is "+sum);
	}

}
