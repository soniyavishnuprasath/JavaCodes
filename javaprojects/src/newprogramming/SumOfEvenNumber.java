package newprogramming;

import java.util.Scanner;

public class SumOfEvenNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt(),sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				sum=sum+i;
		}
		System.out.println("Sum of even num for "+n+" is "+sum);
				
	}

}
