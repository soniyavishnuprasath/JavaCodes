package newprogramming;

import java.util.Scanner;

public class NthFibonaciiSeries {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the Nth value");
		int nth=s.nextInt();
		int a=0,b=1,c;
		if(nth==1)
		{
			System.out.println(a);
		}
		else if(nth==2)
		{
			//System.out.println(a);
			System.out.println(b);
		}
		else if(nth>2)
		{
			int count=2;
			//System.out.println(a);
			//System.out.println(b);
			for(int i=3;true;i++)
			{
				c=a+b;
				a=b;
				b=c;
				//System.out.println(c);
				count++;
				if(count==nth)
				{
					System.out.println(c);
					break;
				}
			}
		}
		
	}

}
