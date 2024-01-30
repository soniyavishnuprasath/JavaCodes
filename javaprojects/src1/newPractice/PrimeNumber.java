package newPractice;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	/* 
	 * int num=12,count=0; for(int i=1;i<=num;i++) { if(num%i==0) count++; }
	 * if(count==2) System.out.println(num +" is a prime number"); else
	 * System.out.println(num +" is not a prime number");
	 */
	
	/* prime number in range
	 * for(int j=1;j<=100;j++) { int num=j,count=0; for(int i=1;i<=num;i++) {
	 * if(num%i==0) count++; } if(count==2) System.out.println(num);
	 * 
	 * }
	 */
	
	/*
	 * //prime number in particular Scanner scan=new Scanner(System.in);
	 * System.out.println("enter the position for prime number"); int
	 * pCount=0,nth=scan.nextInt(); for(int j=1;true;j++) { int num=j,count=0;
	 * for(int i=1;i<=num;i++) { if(num%i==0) count++; } if(count==2) { pCount++;
	 * if(pCount==nth) { System.out.println(num); break; } }
	 * 
	 * 
	 * }
	 */
	
	//the prime number to find its position
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the prime number to find its position");
	int pCount=0,nth=scan.nextInt();
	for(int j=1;true;j++)
	{
	int num=j,count=0;
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
			count++;
	}
	if(count==2)
	{
		pCount++;
		if(num==nth)
		{
			System.out.println(pCount);
			break;
		}
	}
	
	
	}
}
}
