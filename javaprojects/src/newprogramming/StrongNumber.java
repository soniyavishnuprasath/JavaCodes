package newprogramming;

import java.util.Scanner;

//sum of factorial of given number is equal to given number then that number is strong number
public class StrongNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int temp=n,sum=0;
		while(n!=0)
		{
			int k=n%10;
			sum=sum+factorial(k);
			n=n/10;
		}
		if(temp==sum)
			System.out.println(temp+" is strong number");
		else
			System.out.println(temp+" is not a strong number");
		
	}
	public static int factorial(int f)
	{
		int fact=1;
		for(int i=1;i<=f;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
