package newprogramming;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of m");
		int m=s.nextInt();
		System.out.println("enter the value of n");
		int n=s.nextInt();
		int power=1;
		for(int i=1;i<=n;i++)
		{
			power=power*m;
		}
		System.out.println(m+" To the Power of "+n+" is "+power);
	
	}
}
