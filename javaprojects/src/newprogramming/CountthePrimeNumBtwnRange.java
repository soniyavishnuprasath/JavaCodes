package newprogramming;

import java.util.Scanner;

public class CountthePrimeNumBtwnRange {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the starting range");
		int f=s.nextInt();
		System.out.println("enter the end range");
		int m=s.nextInt();
		int pcount=0;
		for(int i=f;i<=m;i++)
		{
			int n=i,count=0;
			for(int j=1;j<=n;j++)
			{
				
				if(n%j==0)
				count++;
			}
			if(count==2)
				pcount++;
		}
		System.out.println(pcount);
		
	}

}
