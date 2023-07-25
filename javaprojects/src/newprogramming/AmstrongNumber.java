package newprogramming;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int count=count(n),temp=n,sum=0;
		while(n!=0)
		{
			int k=n%10;
			sum=sum+power(k,count);
			n=n/10;
		}
		if(temp==sum)
			System.out.println(temp+" is an amstrong  number");
		else
			System.out.println(temp+" is not an amstrong number");
		
	}
	public static int count(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
	public static int power(int m,int n)
	{
		int pow=1;
		for(int i=1;i<=n;i++)
		{
			pow=pow*m;
		}
		return pow;
	}

}
