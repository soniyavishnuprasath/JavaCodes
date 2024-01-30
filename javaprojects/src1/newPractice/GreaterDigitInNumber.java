package newPractice;

import java.util.Scanner;

public class GreaterDigitInNumber {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number to find Greater digit");
	int num=scan.nextInt(),max=0;
	int temp=num;
	while(num!=0)
	{
		int k=num%10;
		if(k>max)
		{
			max=k;
		}
		num=num/10;
	}
	System.out.println("the greatest number in "+temp+" is "+max);
}
}
