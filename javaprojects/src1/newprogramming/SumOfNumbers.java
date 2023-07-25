package newprogramming;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i; //sum+=i; another way
		}
		System.out.println("sum of "+n+" is"+sum);
	}

}
