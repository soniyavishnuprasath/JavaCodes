package newprogrammingArrays;

import java.util.Scanner;

public class FindPrimeNumInArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size fo the array");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("enter the value of arrays");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			int n=a[i],count=0;
			for(int j=1;j<=n;j++)
			{
			if(n%j==0)
				count++;
			}
			if(count==2)
			{
				System.out.println("prime numbers in array are "+n);
			}
			
		}
	}

}
