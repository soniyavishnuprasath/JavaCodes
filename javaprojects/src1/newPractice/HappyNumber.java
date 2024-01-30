package newPractice;

import java.util.Scanner;

public class HappyNumber {
public static void main(String[] args) {
	//sum of square of each digits should be equal to 1 or 7
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=scan.nextInt();
	int temp=num;
	while(num>9)
	{
		int sum=0;
		while(num!=0)
		{
			int k=num%10;
			sum=sum+k*k;
			num=num/10;
		}
		num=sum;
	}
	if(num==1 || num==7)
		System.out.println(temp+" is a happy number");
	else
		System.out.println(temp+" is a not happy number");
	
}
}
