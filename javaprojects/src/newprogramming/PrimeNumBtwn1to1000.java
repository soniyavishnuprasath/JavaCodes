package newprogramming;

import java.util.Scanner;

public class PrimeNumBtwn1to1000 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//System.out.println("enter the starting range");
		//int f=s.nextInt();
		System.out.println("enter the end range");
		int m=s.nextInt();
		for(int i=1;i<=m;i++)
		{
			int n=i,count=0;
			for(int j=1;j<=i;j++)
			{
				
				if(n%j==0)
				count++;
			}
			if(count==2)
				System.out.println(n);
		}
		
	}

}
