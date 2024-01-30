package newPractice;

import java.util.Scanner;

public class FibbonacciSeries {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	/*
	 * System.out.println("Enter the number"); int num=scan.nextInt(); int
	 * a=0,b=1,c; if(num==1) { System.out.println(a); } if(num==2) {
	 * System.out.println(a); System.out.println(b); } if(num>=3) {
	 * System.out.println(a); System.out.println(b); for(int i=3;i<=num;i++) {
	 * c=a+b; a=b; b=c; System.out.println(c); } }
	 */
	
	System.out.println("Enter the number");
	int num=scan.nextInt();
	int a=0,b=1,c;
	if(num==1)
	{
		System.out.println(a);
	}
	if(num==2)
	{
		//System.out.println(a);
		System.out.println(b);
	}
	if(num>=3)
	{
		int count=2;
		for(int i=3;true;i++)
		{
		c=a+b;
		a=b;
		b=c;
		count++;
		
		if(num==count)
		{
			System.out.println(c);
			break;
		}
		}
	}
}
}
