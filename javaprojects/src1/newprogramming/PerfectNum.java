package newprogramming;

import java.util.Scanner;

/*perfect no means find the factor of a given num addition of all 
 * the factors excluding the last one should be equal to last factor.
 * factor of 6=1,2,3,6          1+2+3=6*/
public class PerfectNum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt(),sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			sum=sum+i;

		}
		if(sum==n)
			System.out.println(n+" is perfect num");
		else
			System.out.println(n+" is non-perfect num");
	}

}
