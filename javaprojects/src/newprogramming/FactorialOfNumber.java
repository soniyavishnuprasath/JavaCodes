package newprogramming;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=s.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i; //fact*=i another way
		}
		System.out.println("sum of "+n+" is "+fact);
	}

}
