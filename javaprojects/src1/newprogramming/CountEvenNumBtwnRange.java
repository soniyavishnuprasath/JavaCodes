package newprogramming;

import java.util.Scanner;

public class CountEvenNumBtwnRange {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the start range");
		int f=s.nextInt();
		System.out.println("enter the end range");
		int n=s.nextInt();
		int count=0;
		for(int i=f;i<=n;i++)
		{
			if(i%2==0)
				count++;
		}
		System.out.println("even numbers between "+f+" to "+n+" is" +count);
	}

}
