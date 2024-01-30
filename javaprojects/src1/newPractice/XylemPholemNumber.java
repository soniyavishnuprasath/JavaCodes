package newPractice;

import java.util.Scanner;

public class XylemPholemNumber {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number to find xylem number");
	int num=scan.nextInt();
	int temp=num,sum=num%10,midSum=0;
	num=num/10;
	while(num!=0)
	{
		int k=num%10;
		if(num<=9)
		{
			sum=sum+k;
		}
		else
		{
			midSum=midSum+k;
		}
		num=num/10;
	}
	if(sum==midSum)
		System.out.println(temp+" is a xylem number");
	else
		System.out.println(temp+" is a pholem number");
}
}
