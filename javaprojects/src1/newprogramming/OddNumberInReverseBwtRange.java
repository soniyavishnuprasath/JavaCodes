package newprogramming;

import java.util.Scanner;

public class OddNumberInReverseBwtRange {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the starting range");
		int f=s.nextInt();
		System.out.println("enter the end range");
		int n=s.nextInt();
		for(int i=n;i>=f;i--)
		{
			if(i%2!=0)
			System.out.println(i);
		}
	}

	
}
