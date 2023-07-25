package newprogramming;

import java.util.Scanner;

public class CountTheFactor {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		System.out.println("number of factor of "+n+" is ");
		int count=0;
		for(int i=1;i<=n;i++)
		{
			
			if(n%i==0)
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
