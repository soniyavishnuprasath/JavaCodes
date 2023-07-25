package newprogramming;

import java.util.Scanner;
// fibonaci series 0 1 1 2 3 5 8.... adding previous 2digits
public class FibonaciSeries {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter how many digits");
	int n=s.nextInt();
	int a=0,b=1,c;
	if(n==0)
		System.out.println(a);
	else if(n==1)
	{
		System.out.println(a);
		System.out.println(b);
	}
	else if(n>2)
	{
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}
}
}
