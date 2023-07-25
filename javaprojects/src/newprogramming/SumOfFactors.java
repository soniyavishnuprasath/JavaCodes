package newprogramming;

import java.util.Scanner;

public class SumOfFactors {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt(),sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				sum=sum+i;
				
		}
		System.out.println("sum of factors for "+n+" is "+sum);
	}

}
