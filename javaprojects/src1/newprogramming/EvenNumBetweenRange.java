package newprogramming;

import java.util.Scanner;

public class EvenNumBetweenRange {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the 1st range");
	int f=s.nextInt();
	System.out.println("enter the last range");
	int n=s.nextInt();
	for(int i=f;i<=n;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
}
}
