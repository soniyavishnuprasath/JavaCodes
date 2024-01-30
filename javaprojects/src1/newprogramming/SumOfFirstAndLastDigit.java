package newprogramming;

import java.util.Scanner;

public class SumOfFirstAndLastDigit {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt(),sum;
	sum=n%10;
	while(n!=0)
	{
		int k=n%10;
		if(n<=9)
		{
			sum=sum+k;
		}
		n=n/10;
	}
	System.out.println("sum of 1st and last digit is "+sum);
}
}
